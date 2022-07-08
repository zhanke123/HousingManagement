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
    <div align="center" style="font-size: 30px;font-weight: bold;margin-top: 20px;color: gray">网上业务平台</div>
    <div align="center" style="margin-top: 5%">
        <form action="UnitRegister" method="post">
            <div style="font-weight: bold;font-size: 20px;color: firebrick">单位缴存登记及开户</div><br>
            <div>
                <table>
                    <tr style="width: 100%">
                        <td>单位名称：</td>
                        <td><input name="UnitName" type="text"></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>单位地址：</td>
                        <td><input name="UnitAddress" type="text"></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>组织机构代码：</td>
                        <td><input name="Coding" type="text"></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>单位类别：</td>
                        <td>
                            企业<input name="ScaleCoding" type="radio" value="1">&nbsp;
                            事业<input name="ScaleCoding" type="radio" value="2">&nbsp;
                            机关<input name="ScaleCoding" type="radio" value="3">&nbsp;
                            团体<input name="ScaleCoding" type="radio" value="4">&nbsp;
                            其他<input name="ScaleCoding" type="radio" value="5">
                        </td>
                    </tr>
                    <tr style="width: 100%">
                        <td>企业类型：</td>
                        <td>
                            <select name="companyClass">
                                <option value="110">国有经济</option>
                                <option value="120">集体经济</option>
                                <option value="130">股份合作企业</option>
                                <option value="140">联营企业</option>
                                <option value="150">有限责任公司</option>
                                <option value="160">股份有限公司</option>
                                <option value="170">私营企业</option>
                                <option value="190">其他企业</option>
                                <option value="200">港、澳、台商投资企业</option>
                                <option value="300">外商投资企业</option>
                                <option value="900">其他</option>
                            </select>
                        </td>
                    </tr>
                    <tr style="width: 100%">
                        <td>发薪日期：</td>
                        <td>
                            <select name="date">
                                <option value="1">01</option>
                                <option value="2">02</option>
                                <option value="3">03</option>
                                <option value="4">04</option>
                                <option value="5">05</option>
                                <option value="6">06</option>
                                <option value="7">07</option>
                                <option value="8">08</option>
                                <option value="9">09</option>
                                <option value="10">10</option>
                                <option value="11">11</option>
                                <option value="12">12</option>
                                <option value="13">13</option>
                                <option value="14">14</option>
                                <option value="15">15</option>
                                <option value="16">16</option>
                                <option value="17">17</option>
                                <option value="18">18</option>
                                <option value="19">19</option>
                                <option value="20">20</option>
                                <option value="21">21</option>
                                <option value="22">22</option>
                                <option value="23">23</option>
                                <option value="24">24</option>
                                <option value="25">25</option>
                                <option value="26">26</option>
                                <option value="27">27</option>
                                <option value="28">28</option>
                                <option value="29">29</option>
                                <option value="30">30</option>
                                <option value="31">31</option>
                            </select>
                        </td>
                    </tr>
                    <tr style="width: 100%">
                        <td>联系电话：</td>
                        <td><input name="tel" type="text"></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>单位经办人：</td>
                        <td><input name="unitPeople" type="text"></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>经办人身份证号码：</td>
                        <td><input name="ownNumber" type="text"></td>
                    </tr>
                    <tr style="width: 100%">
                        <td>单位比例：</td>
                        <td>
                            <select name="unitScale">
                                <option value="5">5%</option>
                                <option value="6">6%</option>
                                <option value="7">7%</option>
                                <option value="8">8%</option>
                                <option value="9">9%</option>
                                <option value="10">10%</option>
                                <option value="11">11%</option>
                                <option value="12">12%</option>
                                <option value="13">13%</option>
                                <option value="14">14%</option>
                                <option value="15">15%</option>
                            </select>
                        </td>
                    </tr>
                    <tr style="width: 100%">
                        <td>个人比例：</td>
                        <td>
                            <select name="selfScale">
                                <option value="5">5%</option>
                                <option value="6">6%</option>
                                <option value="7">7%</option>
                                <option value="8">8%</option>
                                <option value="9">9%</option>
                                <option value="10">10%</option>
                                <option value="11">11%</option>
                                <option value="12">12%</option>
                                <option value="13">13%</option>
                                <option value="14">14%</option>
                                <option value="15">15%</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>备注:</td>
                        <td>
                            <input name="note" type="text">
                        </td>
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
