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
        .button{
            border: none;
            color: white;
            width: 200px;
            height: 60px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 25px;
            font-weight: bold;
            border-radius: 5px;
            margin-top: 5%;
            -webkit-transition-duration: 0.4s;
            transition-duration: 0.4s;
        }
        #userButton{
            background-color: firebrick;
            margin-bottom: 10%;
        }
        .button:hover {
            box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
        }
        #goButton:hover {
            box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
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
        <form action="updateSystem" method="post">
            <div style="font-weight: bold;font-size: 20px;color: firebrick">系统参数维护</div><br>
            <div>
                <table>
                    <tr style="width: 100%">
                        <td>键值信息：</td>
                        <td><input name="SEQNAME" type="text"></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>初始序列号：</td>
                        <td><input name="SEQ" type="text"></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>最大序列号：</td>
                        <td><input name="MAXSEQ" type="text"></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>描述：</td>
                        <td><input name="DESC" type="text"></td>
                    </tr>
                    <tr>
                        <td>备用1:</td>
                        <td>
                            <input name="FREEUSE1" type="text">
                        </td>
                </table>
            </div>
            <input type="submit" id="userButton" class="button" value="提交">
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
<%
    if(session.getAttribute("username")==null)response.sendRedirect("/index.html");
%>
</body>
</html>
