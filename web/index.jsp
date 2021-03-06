<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/11
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>登陆</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/reset.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/main.css">
    <!--[if IE 6]>
    <script type="text/javascript" src="js/DD_belatedPNG_0.0.8a-min.js"></script>
    <script type="text/javascript" src="js/ie6Fixpng.js"></script>
    <![endif]-->
</head>

<body>
<div class="headerBar">
    <div class="logoBar login_logo">
        <div class="comWidth">
            <h3 class="welcome_title">欢迎登陆员工管理系统</h3>
        </div>
    </div>
</div>
<s:form action="employee_login" method="POST" namespace="/">
    <div class="loginBox">
        <h3><s:actionerror/></h3>
        <div class="login_cont">
            <ul class="login">
                <li class="l_tit">用户名</li>
                <li class="mb_10"><input type="text" name="username" class="login_input user_icon"></li>
                <li class="l_tit">密码</li>
                <li class="mb_10"><input type="password" name="password" class="login_input user_icon"></li>
                <li><input type="submit" value="" class="login_btn"></li>
            </ul>
        </div>
    </div>
</s:form>
</body>
</html>

