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
    private static PreparedStatement ps;
    
    static{
    try {
        
             ps=DBConnection.getConnection().prepareStatement("select * from users where username=? and password=?");
            
        }
    catch(SQLException e){
    System.out.println("Error in DB communication:"+e);
}
    
    }
    public static boolean validate(String username,String password) throws SQLException{
         boolean s=false;
    
        try{
        ps.setString(1,username);
        ps.setString(2,password);
        ResultSet rs=ps.executeQuery();
        s=rs.next();
       }
        catch(Exception e){
            System.out.println(e);
        }
        return s;
    }
}
