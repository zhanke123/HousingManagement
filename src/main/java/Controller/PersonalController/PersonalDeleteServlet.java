package Controller.PersonalController;

import Service.PersonalService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SelfDelete")
public class PersonalDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String selfNum = req.getParameter("selfNum");
        PersonalService personalService = new PersonalService();
        int i = personalService.delAccount(selfNum);
        HttpSession session = req.getSession();
        session.setAttribute("info",i);
        resp.sendRedirect("/gotoSelfDel");
    }
}
