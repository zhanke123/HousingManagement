package Controller.PersonalController;

import Model.Bean.Personal;
import Service.PersonalService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/selfChange")
public class PersonalChangeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 先判断session中是否存在通过单位帐号查询到的Personal对象，如果没有，先查询然后跳转会原网页反显，如果有则修改
         */
        HttpSession session = req.getSession();
        req.setCharacterEncoding("UTF-8");
        PersonalService personalService = new PersonalService();
        String username = req.getParameter("username");//姓名
        String selfClass = req.getParameter("selfNumber");//sfz
        Personal personal = new Personal();
        Personal personal1 = (Personal) session.getAttribute("PersonalInfo");
        personal.setACCNUM(personal1.getACCNUM());
        personal.setSFZ(selfClass);
        personal.setNAME(username);
        int i = personalService.changePersonal(personal);
        session.setAttribute("info",i);
        resp.sendRedirect("/main.jsp");
    }
}
