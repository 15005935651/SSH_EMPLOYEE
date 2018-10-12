<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/12
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<frameset rows="80,*">
    <frame name="top" src="${pageContext.request.contextPath}/frame/top.html">
    <frameset cols="150,*" id="main">

        <frame src="${pageContext.request.contextPath}/frame/left.html">
        <frame name="right" src="frame/right.html">
    </frameset>
</frameset>
</html>
