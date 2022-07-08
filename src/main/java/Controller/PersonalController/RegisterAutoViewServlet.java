package Controller.PersonalController;

import Model.Bean.Unit;
import Service.PersonalService;
import Service.UnitService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/selfReAutoView")
public class RegisterAutoViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String unitNumber = req.getParameter("unitNumber");
        UnitService unitService = new UnitService();
        HttpSession session = req.getSession();
        Unit unit = unitService.findUnit(unitNumber);
        if(unit!=null){
            session.setAttribute("unitInfo",unit);
        }
        resp.sendRedirect("/selfAccount.jsp");
    }
}
