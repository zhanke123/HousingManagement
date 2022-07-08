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
import java.util.List;

@WebServlet("/gotoUnitDel")
public class gotoDelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UnitService unitService = new UnitService();
        List<Unit> allUnitInfo = unitService.getAllUnitInfo();
        HttpSession session = req.getSession();
        session.setAttribute("UnitList",allUnitInfo);
        resp.sendRedirect("/unitDelete.jsp");
    }
}
