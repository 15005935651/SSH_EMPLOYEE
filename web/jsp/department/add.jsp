<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/14
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head></head>
<body>
<table border="0" width="600px">
    <tr>
        <td align="center" style="font-size:24px; color:#666"> 部门添加</td>
    </tr>
    <tr>
        <td align="right" >
            <a href="javascript:document.getElementById('saveFrom').submit()">保存</a> &nbsp;&nbsp;
            <a href="javascript:history.go(-1)">退回 </a>
        </td>
    </tr>
</table>
<br/>
<br>

<s:form id="saveFrom" action="department_save" method="POST" namespace="/">
<table style="font-size:16px">
    <tr>
        <td>部门名称：</td>
        <td><s:textarea name="dname"/></td>
    </tr>
    <tr>
        <td>部门介绍：</td>
        <td></td>
    </tr>
    <tr>
        <td width="10%"></td>
        <td>
            <s:textarea rows="5" cols="50" name="ddesc"/>
        </td>
    </tr>
</table>
</s:form>
</body>
</html>