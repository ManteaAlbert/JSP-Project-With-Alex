<%--
  Created by IntelliJ IDEA.
  User: alber
  Date: 9/21/2019
  Time: 4:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="departmentService" class="com.sda.service.DepartmentService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>

<html>
<head>
    <title>Departments</title>
</head>
<body>
<h1>Departments page!</h1>
<a href="AddNewDepartment.jsp" target="_blank"> Add New Departments </a>

<c:forEach items="${departmentService.getDepartmentList()}" var="Department">
    <span> <c:out value="${department.getId()}"/>
    <c:out value="${department.getName()}"/></span>
    <br>
</c:forEach>
</body>
</html>
