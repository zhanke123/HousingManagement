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
            height: 76%;
            width: 100%;
            box-shadow:  0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
            margin-top: 20px;
        }
        .button{
            border: none;
            color: white;
            width: 400px;
            height: 100px;
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
        .unLoginButton{
            border: none;
            color: white;
            width: 50px;
            height: 50px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 10px;
            font-weight: bold;
            border-radius: 100%;
            margin-top: 5%;
            -webkit-transition-duration: 0.4s;
            transition-duration: 0.4s;
        }
        .userButton{
            background-color: firebrick;
            margin-left: 10%;
        }
        .managerButton{
            background-color: darkkhaki;
        }
        .button:hover {
            box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
        }
        .gr{
            margin-top: 2%;
        }
        .left{
            float: left;
        }
        .right{
            float: left;
            margin-left: 55%;
        }
        #system{
            position: absolute;
            top: 400px;
            left: 40%;
        }
        #unLogin{
            position: absolute;
            top: 80%;
            left: 49%;
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
    <div class="gr left">
        <a href="unitAccount.jsp">
            <button class="userButton button">单位开户</button><br>
        </a>
    </div>
    <div class="gr right">
        <a href="selfAccount.jsp">
            <button class="managerButton button">个人开户</button><br>
        </a>
    </div>
    <div class="gr left">
        <a href="unitChange.jsp">
            <button class="userButton button">单位资料修改</button><br>
        </a>
    </div>
    <div class="gr right">
        <a href="selfChange.jsp">
            <button class="managerButton button">个人资料修改</button><br>
        </a>
    </div>
    <div class="gr left">
        <a href="gotoUnitDel">
            <button class="userButton button">单位销户</button><br>
        </a>
    </div>
    <div class="gr right">
        <a href="gotoSelfDel">
            <button class="managerButton button">个人销户</button><br>
        </a>
    </div>
    <div id="system">
        <a href="SystemUpdate.jsp">
            <button class="button" style="background-color: gray">系统参数维护</button><br>
        </a>
    </div>
    <div id="unLogin">
        <a href="/unLogin">
            <button class="unLoginButton" style="background-color: gray">退出</button><br>
        </a>
    </div>
    <script>
        if(${info==1}){
            alert("操作成功！");
        }else if(${info==0}){
        alert("操作失败");}
    </script>
</div>
</body>
</html>
