package Controller.UnitController;


import Model.Bean.System;
import Model.Bean.Unit;
import Model.LogicBean.SystemDB;
import Service.UnitService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import static Model.LogicBean.InitialSqlSession.getSession;


@WebServlet("/UnitRegister")
public class UnitRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String unitName = req.getParameter("UnitName");//单位名称
        String unitAddress = req.getParameter("UnitAddress");//单位地址
        String coding = req.getParameter("Coding");//组织机构代码
        String scaleCoding = req.getParameter("ScaleCoding");//单位类别
        String companyClass = req.getParameter("companyClass");//企业类型
        String date = req.getParameter("date");//发薪日期
        String tel = req.getParameter("tel");//联系电话
        String unitPeople = req.getParameter("unitPeople");//单位经办人
        String ownNumber = req.getParameter("ownNumber");//经办人身份证
        String unitScale = req.getParameter("unitScale");//单位比例
        String selfScale = req.getParameter("selfScale");//个人比例
        String note = req.getParameter("note");//备注
        if(unitName==null||unitAddress==null||coding==null||scaleCoding==null||companyClass==null||date==null||
                tel==null||unitPeople==null||ownNumber==null||unitScale==null||selfScale==null||note==null){
            resp.sendRedirect("/main.jsp");
        }
        SystemDB systemDB = new SystemDB();
        System unitSystemInfo = systemDB.getSystemInfo("UNITACCNUM");
        if(unitSystemInfo.getSEQ()<=999999) {
            Integer seq = unitSystemInfo.getSEQ()+1;
            unitSystemInfo.setSEQ(seq);
            systemDB.updateSystem(unitSystemInfo);
            String unitNum = unitSystemInfo.getSEQ()+unitSystemInfo.getDESC();//生成单位公积金帐号
            Unit unit = new Unit();
            unit.setUNITACCNUM(unitNum);
            unit.setUNITACCNAME(unitName);
            unit.setUNITADDR(unitAddress);
            unit.setORGCODE(coding);
            unit.setUNITCHAR(scaleCoding);
            unit.setUNITKIND(companyClass);
            unit.setSALARYDATE(date);
            unit.setUNITPHONE(tel);
            unit.setUNITLINKMAN(unitPeople);
            unit.setUNITAGENTPAPNO(ownNumber);
            unit.setACCSTATE("0");
            unit.setBALANCE("0");
            unit.setBASENUMBER("0");
            unit.setUNITPROP("0");
            unit.setPERPROP("0");
            unit.setUNITPAYSUM("0");
            unit.setPERPAYSUM("0");
            unit.setPERSNUM(1);
            unit.setUNITPROP(unitScale);
            unit.setPERPROP(selfScale);
            unit.setREMARK(note);
            unit.setCREATDATE(new Date());
            UnitService unitService = new UnitService();
            int i = unitService.UnitAccount(unit);
            HttpSession session = req.getSession();
            session.setAttribute("info",i);
        }
        resp.sendRedirect("/index.html");
    }
}
