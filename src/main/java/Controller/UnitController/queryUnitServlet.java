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
import java.util.List;

@WebServlet("/getUnitInfo")
public class queryUnitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String unit = req.getParameter("Unit");
        String unitName = req.getParameter("UnitName");
        System.out.println(unit);
        System.out.println(unitName);
        UnitService unitService = new UnitService();
        if(!unit.equals("")){
            Unit unitInfo = unitService.findUnit(unit);
            HttpSession session = req.getSession();
            if(unitInfo==null)resp.sendRedirect("/queryUnit.html");
            else{
                session.setAttribute("unitInfo",unitInfo);
                resp.sendRedirect("/unitQuery.jsp");
            }
        }else if(!unitName.equals("")){
            List<Unit> units = unitService.SearchUnitInfo("%"+unitName+"%");
            if(units.isEmpty())resp.sendRedirect("/queryUnit.html");
            else {
                HttpSession session = req.getSession();
                session.setAttribute("unitList",units);
                resp.sendRedirect("/unitList.jsp");
            }
        }else resp.sendRedirect("/index.html");
    }
}
