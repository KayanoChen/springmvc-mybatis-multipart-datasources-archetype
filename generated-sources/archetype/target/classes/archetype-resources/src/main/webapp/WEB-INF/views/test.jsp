#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
<%--
  Created by IntelliJ IDEA.
  User: chenz
  Date: 2018/10/31
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Test</title>
</head>
<body>
data0:
<c:forEach items="${symbol_dollar}{data0}" var="data">
    <c:out value="${symbol_dollar}{data.id}"></c:out><br>
    <c:out value="${symbol_dollar}{data.name}"></c:out><br>
</c:forEach>
<br>
data1:
<c:forEach items="${symbol_dollar}{data1}" var="data">
    <c:out value="${symbol_dollar}{data.id}"></c:out><br>
    <c:out value="${symbol_dollar}{data.name}"></c:out><br>
</c:forEach>
</body>
</html>
