<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 02:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>

<html>
<head>
    <title>Employees</title>
</head>
<body>
<h1>Employees page!</h1>
<a href="AddNewEmployee.jsp" target="_blank"> Add New Enployee </a>

<c:forEach items="${employeeService.getEmployeesList()}" var="employee">
    <span> <c:out value="${employee.getId()}"/>
    <c:out value="${employee.getName()}"/></span>
    <br>
</c:forEach>
</body>
</html>