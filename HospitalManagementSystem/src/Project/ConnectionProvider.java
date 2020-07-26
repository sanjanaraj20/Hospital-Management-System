/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;


/**
 *
 * @author Acer
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            System.out.println("hi thete");
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC", "root", "newrootpassword");
           return con;
        }
        catch(Exception e){
            return null;
        }
    }
    
}
