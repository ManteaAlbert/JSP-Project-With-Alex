<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <title>Login Page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="css/loginAndRegister.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body id="unId">
<div id="a" class="loginArea">
    <h2 id="b">Log-in</h2>
    <form method = "post" action="login">
        <input id = "username" type="text" id = "username" class="normalInput" placeholder="Username" name="un">


        <input id = "password" type="t" class="normalInput" placeholder="Password" name="pw">


        <button>login</button>

    </form>
</div>
</body>
</html>