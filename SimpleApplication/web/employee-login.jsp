<%-- 
    Document   : employee-login
    Created on : 30 Dec, 2020, 10:26:07 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/login.css">
        <title>Employee Login</title>
    </head>
    <body>
        <div align="center">
            <h1>Employee Login</h1>
            <form id="login" action="EmployeeLoginController" method="post">
                
                <label for="username">Employee ID:</label>
                <input type="text" placeholder="Enter employee id" name="employeeId" id="employeeId">
                
                <br><br>
                
                <label for="password">Password:</label>
                <input type="password" placeholder="Enter Password" name="employee-password" id="password">
                
                <br><br>
                
                <input type="submit" value="Login" class="login-button">
               
                
            </form>
            <br><br>
            
            <label>Do not have an account? Register Here.</label>
            <a href="register-user.jsp"><button class="register-button">Register</button></a>
        </div>
    </body>
</html>
