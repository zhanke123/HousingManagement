package Controller.UnitController;

import Model.Bean.Unit;
import Model.LogicBean.UnitDB;
import Service.UnitService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/**
 * 先判断session中是否存在通过单位帐号查询到的unit对象，如果没有，先查询然后跳转会原网页反显，如果有则修改
 */
@WebServlet("/UnitChange")
public class UnitChangeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        UnitService unitService = new UnitService();
        HttpSession session = req.getSession();
        Unit unit1 = (Unit)session.getAttribute("UnitInfo");
        String unitNumber = req.getParameter("unitNumber");
        String unitName = req.getParameter("UnitName");  //单位名称
        String unitAddress = req.getParameter("UnitAddress");
        String coding = req.getParameter("Coding");//组织机构代码
        String scaleCoding = req.getParameter("ScaleCoding");//单位类别
        String companyClass = req.getParameter("companyClass");//企业类型
        String date = req.getParameter("date");//发薪日期
        String tel = req.getParameter("tel");//联系电话
        String unitPeople = req.getParameter("unitPeople");//单位经办人
        String ownNumber = req.getParameter("ownNumber");//身份证
        String note = req.getParameter("note");//备注
        Unit unit = new Unit();
        unit.setUNITACCNUM(unit1.getUNITACCNUM());
        unit.setUNITACCNAME(unitName);
        unit.setORGCODE(coding);
        unit.setUNITADDR(unitAddress);
        unit.setUNITCHAR(scaleCoding);
        unit.setUNITKIND(companyClass);
        unit.setSALARYDATE(date);
        unit.setUNITPHONE(tel);
        unit.setUNITLINKMAN(unitPeople);
        unit.setUNITAGENTPAPNO(ownNumber);
        unit.setREMARK(note);
        int i = unitService.changeUnit(unit);
        session.setAttribute("info",i);
        resp.sendRedirect("/main.jsp");
    }
}
