/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MRuser
 */
public class EmpS { 
   void save(Emp e) throws SQLException{
    String sql="insert into emp (name,username,passowrd,phone) values(?,?,?,?)";
     
            
       
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/ATOB","ATOc","asdf");
                
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, e.getName());
            pst.setString(2, e.getUsername());
            pst.setString(3, e.getPassword());
            pst.setString(4, e.getPhone());
            
            
            pst.executeUpdate();
            
            System.out.println("executed Success");
            pst.close();
           
        }
        
     

    }
    
    


