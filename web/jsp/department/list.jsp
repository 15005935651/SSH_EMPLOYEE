<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/13
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <style type="text/css">
        .table1 {
            border: 1px solid #ddd;
            width: 900px;

        }

        thead {
            background-color: lightblue;
        }

    </style>
</head>
<body>
<s:form action="department_quare" method="POST" namespace="/">
<table border="0" width="900px">
    <tr>
        <td align="center" style="font-size:24px; color:#999"> 部门管理</td>
    </tr>
</table>

<br/>

<table cellspacing="0" border="1" class="table1">
    <thead>
    <tr>
        <th width="450">部门名称</th>
        <th width="450">职责</th>
    </tr>
    </thead>
    <tbody>

    <s:iterator value="list" var="d">
    <tr>
        <td align="center"><s:property value="#d.dname"/></td>
        <td align="center"><s:property value="#d.ddesc"/></td>
    </tr>
    </tbody>
    </s:iterator>
</table>
</s:form>
<br/>


<table border="0" cellspacing="0" cellpadding="0" width="900px">
    <tr>
        <td align="right">
            <span>第<s:property value="currPage"/>/<s:property value="totalPage"/>页</span>
            <span>总记录数：<s:property value="totalCount"/> 每页显示：<s:property value="pageSize"/> </span>
            <span>
            <s:if test="currPage != 1">
                <a href="${pageContext.request.contextPath}/department_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp;
                <a href="${pageContext.request.contextPath}/department_findAll.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
            </s:if>
             <s:if test="currPage != totalPage">
                 <a href="${pageContext.request.contextPath}/department_findAll.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
                 <a href="${pageContext.request.contextPath}/department_findAll.action?currPage=<s:property value="totalPage"/>">[尾页]</a>&nbsp;&nbsp;
             </s:if>
            </span>
        </td>
    </tr>
</table>
</body>
</html>