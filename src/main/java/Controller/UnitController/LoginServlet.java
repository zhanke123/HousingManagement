package Controller.UnitController;

import Model.LogicBean.ManagerDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        ManagerDB managerDB = new ManagerDB();
        if(password.equals(managerDB.getPassword(username))){
            HttpSession session = req.getSession();
            session.setAttribute("username",username);
            resp.sendRedirect("/main.jsp");
        }else{
            resp.sendRedirect("/Login.html");
        }
    }
}
