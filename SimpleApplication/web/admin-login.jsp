<%-- 
    Document   : admin-login
    Created on : 30 Dec, 2020, 12:16:20 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/login.css">
        <title>Admin Login</title>
    </head>
    <body>
        <div align="center">
            <h1> Admin Login</h1>
            <form id="login" action="AdminLoginController" method="post">
                
                <label for="username">Admin Id</label>
                <input type="text" placeholder="Enter Username" name="adminId" id="adminId">
                
                <br><br>
                
                <label for="password">Password:</label>
                <input type="password" placeholder="Enter Password" name="password" id="password">
                
                <br><br>
                
                <input type="submit" value="Login" class="login-button">
               
                
            </form>
            <br><br>
            
            <label>Do not have an account? Register Here.</label>
            <a href="register-user.jsp"><button class="register-button">Register</button></a>
        </div>
    </body>
</html>
