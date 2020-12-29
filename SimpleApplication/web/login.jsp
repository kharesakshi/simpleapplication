<%-- 
    Document   : login
    Created on : 29 Dec, 2020, 1:14:28 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
    </head>
    <body>
        <div align="center">
            <h1>Login</h1>
            <form id="login" action="LoginController" method="post">
                <label for="username">Username:</label>
                <input type="text" placeholder="Enter Username" name="username" id="username">
                
                <br><br>
                
                <label for="password">Password:</label>
                <input type="password" placeholder="Enter Password" name="password" id="password">
                
                <br><br>
                
                <input type="submit" value="Login">
                
            </form>
        </div>
    </body>
</html>
