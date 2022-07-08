package Controller.UnitController;

import Model.LogicBean.UnitDB;
import Service.UnitService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/UnitDelete")
public class UnitDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String unitNum = req.getParameter("UnitNum");
        UnitService unitService = new UnitService();
        System.out.println(unitNum);
        int i = unitService.delAccount(unitNum);
        HttpSession session = req.getSession();
        session.setAttribute("info",i);
        resp.sendRedirect("/gotoUnitDel");
    }
}
