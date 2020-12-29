/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleapplication.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class DBConnection {
    
    private static Connection conn;
    
    private DBConnection(){
        
    }
    
static
{
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver successfully loaded");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/login","/*<username>*/","/*<password>*/");
    }
    catch(ClassNotFoundException e)
            {
                e.printStackTrace();
                System.out.println("Exception in loading the driver:"+e.getMessage());
            }
    catch(SQLException e)
    {
        e.printStackTrace();
        System.out.println("Exception in opening the connection:"+e.getMessage());
    }
}



public static Connection getConnection()
{
return conn;
}

public static void closeConnection()
{
 try
{
conn.close();
}
catch(SQLException e)
{
 e.printStackTrace();
System.out.println("Exception while disconnecting");
}
}
    
}
