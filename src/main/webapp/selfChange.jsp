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
    .button,#goButton{
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
    String[] info = {"","","","",""};
    if(session.getAttribute("PersonalInfo")!=null){
      Personal personal = (Personal) session.getAttribute("PersonalInfo");
      info[0] = personal.getACCNUM();
      info[1] = personal.getNAME();
      info[2] = personal.getSFZ();
      info[3] = personal.getUNITACCNUM();
      info[4] = personal.getUINTNAME();
    }
  %>
  <div align="center" style="font-size: 30px;font-weight: bold;margin-top: 20px;color: gray">网上业务平台</div>
  <div align="center" style="margin-top: 5%">
    <form action="selfChange" METHOD="post">
      <div style="font-weight: bold;font-size: 20px;color: firebrick">个人资料变更</div><br>
      <div>
        <table>
          <tr style="width: 100%">
            <td>个人帐号：</td>
            <td><input id="userNum" name="userNum" type="text" onblur="autoInfo()" placeholder="<%=info[0]%>"></td>
            <script>
              function autoInfo(){
                let userNum = document.getElementById("userNum").value;
                  window.location.href = "/PersonalAutoView?userNum=" + userNum
              }
            </script>
          </tr>
          <tr style="width: 100%">
            <td>姓名：</td>
            <td><input name="username" type="text" placeholder="<%=info[1]%>"></td>
          </tr>
          <tr style="width: 100%">
            <td>证件类型：</td>
            <td>
              <select name="SelfClass">
                <option value="01">身份证</option>
                <option value="02" disabled>军官证</option>
                <option value="03" disabled>护照</option>
                <option value="04" disabled>其他</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>证件号码:</td>
            <td>
              <input name="selfNumber" type="text" placeholder="<%=info[2]%>">
            </td>
          </tr>
          <tr style="width: 100%">
            <td>单位帐号：</td>
            <td><input name="UnitNumber" type="text" disabled placeholder="<%=info[3]%>"></td>
          </tr>
          <tr style="width: 100%">
            <td>单位名称：</td>
            <td><input name="UnitName" type="text" disabled placeholder="<%=info[4]%>"></td>
          </tr>
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
