<%@ page import="Model.Bean.Unit" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
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
        td{
            width: 10%;
            height: 40px;
            border-bottom: 1px solid #ddd;
            font-size: 15px;
            text-align: center;
        }
        button,#goButton{
            border: none;
            background-color: firebrick;
            color: white;
            width: 100px;
            margin-bottom: 2px;
            height: 40px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 15px;
            font-weight: bold;
            border-radius: 5px;
            -webkit-transition-duration: 0.4s;
            transition-duration: 0.4s;
        }
        button:hover {
            box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
        }
        #goButton:hover {
            box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
        }
        #goButton{
            background-color: firebrick;
            position: absolute;
            top: 15%;
            left: 32%;
            font-size: 10px;
            width: 50px;
            height: 50px;
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
            <div align="center" style="font-size: 30px;color: firebrick;margin-bottom: 20px">查询结果</div>
                <table style="margin-left: 4%;margin-right: 4%">
                    <tr style="color: firebrick">
                        <td>单位名称</td>
                        <td>单位帐号</td>
                        <td>单位地址</td>
                        <td>机构代码</td>
                        <td></td>
                    </tr>
                    <c:forEach items="${unitList}" var="unit" varStatus="id">
                        <tr>
                            <td>${unit.UNITACCNAME}</td>
                            <td>${unit.UNITACCNUM}</td>
                            <td>${unit.UNITADDR}</td>
                            <td>${unit.ORGCODE}</td>
                            <td><a href="/getUnitInfo?Unit=${unit.UNITACCNUM}"><button>查看</button></a></td>
                        </tr>
                    </c:forEach>
                </table>
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
