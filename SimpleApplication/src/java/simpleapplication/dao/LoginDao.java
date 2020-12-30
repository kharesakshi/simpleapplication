/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleapplication.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import simpleapplication.dbutil.DBConnection;
import simpleapplication.model.Login;

/**
 *
 * @author Lenovo
 */
public class LoginDao {
    
    private static Login l;
    private static PreparedStatement ps1,ps2,ps3,ps4,ps5;
    
    static{
    try {
        
             ps1=DBConnection.getConnection().prepareStatement("select * from users where userId=? and password=?");
             ps2=DBConnection.getConnection().prepareStatement("insert into users values(?,?,?)");
             ps3=DBConnection.getConnection().prepareStatement("select * from employee where employeeId=? and password=?");
             ps4=DBConnection.getConnection().prepareStatement("select * from admin where adminId=? and password=?");
            // ps5=DBConnection.getConnection().prepareStatement("select user_role from users where userId=? and password=?");
    }
    catch(SQLException e){
    System.out.println("Error in DB communication:"+e);
}
    
    }
    public static boolean validate(String userId,String password) throws SQLException{
         boolean s=false;
    
       try{
        ps1.setString(1,userId);
        ps1.setString(2,password);
        ResultSet rs=ps1.executeQuery();
        s=rs.next();
       }
       catch(SQLException e){
           System.out.println(e);
       }
        return s;
    }
    
    /*public static String fetchUserRole(Login login){
        String username=login.getUserId();
        String password=login.getPassword();
        String s=login.getUserRole();
        
        String username1="";
        String password1="";
        String userRole="";
        
        try{
        ResultSet rs=ps5.executeQuery();
        
        while(rs.next()){
            username1=rs.getString("username");
            password1=rs.getString("password");
            userRole=rs.getString("s");
            
             if(username.equals(username1) && password.equals(password1) && userRole.equals("admin"))
            return "admin";
            else if(username.equals(username1) && password.equals(password1) && userRole.equals("employee"))
            return "employee";
            
        }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        
        return s;
    }*/
    
    public static boolean employeeLogin(String employeeId,String password) throws SQLException{
         boolean s=false;
    
        try{
        ps3.setString(1,employeeId);
        ps3.setString(2,password);
        ResultSet rs=ps3.executeQuery();
        s=rs.next();
       }
        catch(Exception e){
            System.out.println(e);
        }
        return s;
    }
    
    public static boolean adminLogin(String adminId,String password) throws SQLException{
         boolean s=false;
    
        try{
        ps4.setString(1,adminId);
        ps4.setString(2,password);
        ResultSet rs=ps4.executeQuery();
        s=rs.next();
       }
        catch(Exception e){
            System.out.println(e);
        }
        return s;
    }
    
    
    
    public static boolean register(Login login) throws SQLException{
        ps2.setString(1,login.getFullName());
        ps2.setString(2,login.getUsername());
        ps2.setString(3,login.getPassword());
        
        int y=ps2.executeUpdate();
 
        return y>0;
    }
}
