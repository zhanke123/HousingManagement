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
import java.util.List;

@WebServlet("/gotoSelfDel")
public class gotoDelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PersonalService personalService = new PersonalService();
        List<Personal> allPersonalInfo = personalService.getAllPersonalInfo();
        HttpSession session = req.getSession();
        session.setAttribute("selfList",allPersonalInfo);
        resp.sendRedirect("/selDelete.jsp");
    }
}
