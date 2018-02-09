/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.SQLException;
import static java.time.Clock.system;

public class jdbct 
{ 
    public static void main(String[] args) throws SQLException, java.sql.SQLException {
     Emp e=new Emp();
     e.setName("gerag");
     e.setPassword("gfag");
     e.setUsername("name");
     e.setPhone("number");
     
     EmpS service=new EmpS();
     service.save(e);
 
    
            }
}
             
    

    
