package Controller.SystemController;

import Model.Bean.System;
import Model.LogicBean.SystemDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateSystem")
public class updateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String seqname = req.getParameter("SEQNAME");
        Integer seq = Integer.parseInt( req.getParameter("SEQ"));
        Integer maxseq = Integer.parseInt(req.getParameter("MAXSEQ"));
        String desc = req.getParameter("DESC");
        String freeuse1 = req.getParameter("FREEUSE1");
        System system = new System();
        system.setSEQNAME(seqname);
        system.setSEQ(seq);
        system.setMAXSEQ(maxseq);
        system.setDESC(desc);
        system.setFREEUSE1(freeuse1);
        SystemDB systemDB = new SystemDB();
        systemDB.insertSystem(system);
        resp.sendRedirect("/main.jsp");
    }
}
