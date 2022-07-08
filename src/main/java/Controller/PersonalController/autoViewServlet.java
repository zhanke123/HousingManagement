package Controller.PersonalController;

import Model.Bean.Personal;
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

@WebServlet("/PersonalAutoView")
public class autoViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userNum = req.getParameter("userNum");
        PersonalService personalService = new PersonalService();
        Personal personal = personalService.findPersonal(userNum);
        HttpSession session = req.getSession();
        if(personal==null){
                session.setAttribute("info","0");
        }else {
            UnitService unitService = new UnitService();
            Unit unit = unitService.findUnit(personal.getUNITACCNUM());
            if(unit==null){
                resp.sendRedirect("/selfChange.jsp");
            }else {
                personal.setUINTNAME(unit.getUNITACCNAME());
                session.setAttribute("PersonalInfo",personal);
            }
        }
        resp.sendRedirect("/selfChange.jsp");
    }
}
