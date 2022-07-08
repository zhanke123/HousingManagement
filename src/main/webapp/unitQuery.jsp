<%@ page import="Model.Bean.Unit" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        #banner{
            width: 100%;
            height: 200px;
            background-color: firebrick;
            top: 0;
        }
        #choose{
            width: 800px;
            box-shadow:  0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
            margin-top: 20px;
            margin-left: 30%;
        }
        input[type=text], select {
            width: 120%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 2px;
            box-sizing: border-box;
        }
        #goButton{
            background-color: firebrick;
            position: absolute;
            top: 24%;
            left: 32%;
            font-size: 10px;
            width: 50px;
            height: 50px;
            border: none;
            color: white;
            margin-bottom: 2px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-weight: bold;
            border-radius: 5px;
            -webkit-transition-duration: 0.4s;
            transition-duration: 0.4s;
        }
        #goButton:hover{
            box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
        }
    </style>
</head>
<body>
<div id="banner">
    <div style="height: 1px"></div>
    <div style="color: white;font-size: 40px;margin-left: 10%;margin-top:40px;font-weight: bold">
        住房公积金管理系统
    </div>
    <div style="color: white;font-size: 20px;margin-left: 10%">h o u s i n g  f u n d  m a n a g e m e n t</div>
</div>
<div id="choose">
    <%
        Unit unit = (Unit) session.getAttribute("unitInfo");
    %>
    <div align="center" style="font-size: 30px;font-weight: bold;margin-top: 20px;color: gray">网上业务平台</div>
    <div align="center" style="margin-top: 5%">
        <form action="">
            <div style="font-weight: bold;font-size: 30px;color: firebrick">单位信息表</div><br>
            <div>
                <table>
                    <tr style="width: 100%">
                        <td>单位名称：</td>
                        <td><input name="UnitName" type="text" placeholder="<%=unit.getUNITACCNAME()%>" disabled></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>单位帐号：</td>
                        <td><input name="UnitNum" type="text" placeholder="<%=unit.getUNITACCNUM()%>" disabled></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>单位地址：</td>
                        <td><input name="UnitAddress" type="text" placeholder="<%=unit.getUNITADDR()%>" disabled></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>单位经办人：</td>
                        <td><input name="unitPeople" type="text" placeholder="<%=unit.getUNITLINKMAN()%>" disabled></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>联系电话：</td>
                        <td><input name="ownNumber" type="text" placeholder="<%=unit.getUNITPHONE()%>" disabled></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>缴存比例：</td>
                        <td>
                            <input name="allScale" type="text" placeholder="<%=unit.getBASENUMBER()%>" disabled>
                        </td>
                    </tr>
                    <tr style="width: 100%">
                        <td>最后汇缴月：</td>
                        <td>
                            <input name="lastMonth" type="text" placeholder="<%=unit.getLASTPAYDATE()%>" disabled>
                        </td>
                    </tr>
                    <tr style="width: 100%">
                        <td>月汇缴金额：</td>
                        <td>
                            <input name="monthBill" type="text" placeholder="<%=unit.getUNITPAYSUM()%>" disabled>
                        </td>
                    </tr>
                    <tr>
                        <td>人数:</td>
                        <td>
                            <input name="peopleNum" type="text" placeholder="<%=unit.getPERSNUM()%>>" disabled>
                        </td>
                    </tr>
                </table>
                <div style="height: 10%"></div>
            </div>
        </form>
    </div>
</div>
<div>
    <a href="/index.html">
        <button id="goButton">
            首页
        </button>
    </a>
</div>
</body>
</html>
