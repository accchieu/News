<%-- 
    Document   : resetPass
    Created on : Dec 12, 2022, 6:33:20 PM
    Author     : vuhai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="reset" method="post">
            Email:<input type="text" name="email" value="${email}">
            <br>Username:<input type="text" name="username" value="${username}">
            <br><input type="submit" name="login" value="Reset Password">
            <br>New password:<input type="text" name="newpass" value="${newpass}">
        </form>
    </body>
</html>
