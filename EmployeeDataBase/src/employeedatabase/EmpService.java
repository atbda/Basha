
package employeedatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EmpService {
 
   void save(EmployeeDataBase e) throws SQLException{
    String sql="insert into EmployeeDataBase (id,name,username,password,phone) values(?,?,?,?,?)";
     
            
       
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/ATOB","ATOc","asdf");
                
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, e.getId());
            pst.setString(2, e.getName());
            pst.setString(3, e.getUsername());
            pst.setString(4, e.getPassword());
            pst.setString(5, e.getPhone());            
            
            pst.executeUpdate();
            
            System.out.println("executed Success");
            pst.close();
           
        }
        
     

    }
    
    



