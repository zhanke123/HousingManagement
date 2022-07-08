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

@WebServlet("/querySelf")
public class queryPersonalServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        if(!username.equals("")){
            PersonalService personalService = new PersonalService();
            HttpSession session = req.getSession();
            Personal personal = personalService.findPersonal(username);
            if(!(personal == null)){
                session.setAttribute("selfInfo",personal);
                resp.sendRedirect("/selfQuery.jsp");
            }else{
                resp.sendRedirect("/queryElse.html");
            }
        } else resp.sendRedirect("/queryElse.html");
    }
}
