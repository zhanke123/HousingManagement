<%@ page import="Model.Bean.Personal" %>
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
            top: 15%;
            left: 32%;
            font-size: 10px;
            width: 50px;
            height: 50px;
            border: none;
            color: white;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-weight: bold;
            border-radius: 5px;
            margin-top: 5%;
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
<div align="center" style="font-size: 30px;font-weight: bold;margin-top: 20px;color: gray">网上业务平台</div>
<div align="center" style="margin-top: 5%">
<%
    Personal personal = (Personal) session.getAttribute("selfInfo");
%>
    <form action="">
        <div style="font-weight: bold;font-size: 20px;color: firebrick">个人信息</div><br>
        <div>
            <table>
                <tr style="width: 100%">
                    <td>姓名：</td>
                    <td><input name="name" type="text" placeholder="<%=personal.getNAME()%>" disabled></td>
                </tr>
                <tr style="width: 100%">
                    <td>个人帐号：</td>
                    <td><input name="username" type="text" placeholder="<%=personal.getACCNUM()%>" disabled></td>
                </tr>
                <tr style="width: 100%">
                    <td>余额：</td>
                    <td><input name="balance" type="text" placeholder="<%=personal.getBALANCE()%>" disabled></td>
                </tr>
                <tr style="width: 100%">
                    <td>开户日期：</td>
                    <td><input name="date" type="text" placeholder="<%=personal.getOPENDATE()%>" disabled></td>
                </tr>
                <tr style="width: 100%">
                    <td>最后汇缴月：</td>
                    <td><input name="lastMonth" type="text" placeholder="<%=personal.getLASTPAYDATE()%>" disabled></td>
                </tr>
                <tr style="width: 100%">
                    <td>缴存比例：</td>
                    <td><input name="scale" type="text" placeholder="<%=personal.getBASENUMBER()%>" disabled></td>
                </tr>
                <tr style="width: 100%">
                    <td>月汇缴金额：</td>
                    <td><input name="scale" type="text" placeholder="<%=personal.getPERMONPAYSUM()%>" disabled></td>
                </tr>
            </table>
        </div>
        <div style="height: 10%"></div>
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
