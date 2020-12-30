<%-- 
    Document   : employee-homepage
    Created on : 30 Dec, 2020, 12:06:16 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee HomePage</title>
        <link rel="stylesheet" href="styles/homepage.css">
    </head>
    <body>
        <div align="center" class="home-page">
            <h3>You have logged in successfully.</h3>
        
        
            
            <%
                String employeeId=request.getParameter("employeeId");
                out.println("Your Employee Id is:"+employeeId);

            %>
        </div>
    </body>
</html>
