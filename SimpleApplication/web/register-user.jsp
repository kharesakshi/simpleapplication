<%-- 
    Document   : register-user
    Created on : 30 Dec, 2020, 12:37:16 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <div align="center">
            <h1>Registration</h1>
            
            <form id="registration" action="RegisterController" method="post">
                
                
                <label for="username">Username:</label>
                <input type="text" placeholder="Enter Username" name="username" id="username">
                
                <br><br>
                
                <label for="password">Password:</label>
                <input type="password" placeholder="Enter Password" name="password" id="password">
                
                <br><br>
                
                <label for="fullname">Full Name:</label>
                <input type="text" placeholder="Enter Full Name" name="fullname" id="fullname">
                
                <br><br>
                
                <input type="submit" value="Register">
            </form>
            
        </div>
    </body>
</html>
