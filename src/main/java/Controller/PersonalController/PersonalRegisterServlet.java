package Controller.PersonalController;

import Model.Bean.Personal;
import Model.Bean.Unit;
import Service.PersonalService;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;


import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static Model.LogicBean.changeString.convertStreamToString;


@WebServlet("/selfRegister")
@MultipartConfig()
public class PersonalRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        PersonalService personalService = new PersonalService();
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        upload.setHeaderEncoding("utf-8");
        String[] reqList = new String[8];
        int n = 0;
        try {
            List<FileItem> list = upload.parseRequest(req);
            for(FileItem item : list){
                if(item.isFormField()){
                    reqList[n] = item.getString("UTF-8");
                    n++;
                }else {
                    InputStream in = item.getInputStream();   //得到上传数据
                    String s = convertStreamToString(in);
                    personalService.registerAll(s);
                    in.close();
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }


//        String unitNumber = req.getParameter("UnitNumber");//单位帐号
        String username = reqList[4];//姓名
        String selfClass = reqList[5];//证件类型
        String selfNumber = reqList[6];//证件号码
        String sendNumber = reqList[7];//缴存基数


        if(selfNumber.equals("")||selfNumber.equals("")||sendNumber.equals(""))resp.sendRedirect("/selfAccount.jsp");
        else {
            HttpSession session = req.getSession();
            Unit unit = (Unit) session.getAttribute("unitInfo");
            int sfz = personalService.getSFZ(selfNumber);
            if(sfz == 0){
                session.setAttribute("info",0);
            }
            Personal personal = new Personal();
            Integer accNum = personalService.getACCNum();
            if(accNum == 0){
                session.setAttribute("info",0);
            }
            String s = Integer.toString(accNum);
            personal.setACCNUM(s);
            personal.setUNITACCNUM(unit.getUNITACCNUM());
            personal.setOPENDATE(new Date());
            personal.setPERACCSTATE("0");
            personal.setNAME(username);
            personal.setSFZ(selfNumber);
            personal.setBASENUMBER(sendNumber);
            int i = personalService.PersonalAccount(personal);
            session.setAttribute("info",i);
            resp.sendRedirect("/main.jsp");
        }

    }
}
