package Controller.UnitController;

import Model.Bean.Unit;
import Service.UnitService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/autoView")
public class autoViewServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UnitService unitService = new UnitService();
        HttpSession session = req.getSession();
        Object unitInfo = session.getAttribute("UnitInfo");
        String unitNumber = req.getParameter("UnitNumber");//单位帐号
        Unit unitInfo1 = unitService.findUnit(unitNumber);
        if (unitInfo1 != null) {
            session.setAttribute("UnitInfo", unitInfo1);
        }
        resp.sendRedirect("/unitChange.jsp");
    }
}
