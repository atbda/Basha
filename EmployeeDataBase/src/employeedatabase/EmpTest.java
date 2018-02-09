
package employeedatabase;

import java.sql.SQLException;


public class EmpTest {
 

    public static void main(String[] args) throws SQLException, java.sql.SQLException {
     EmployeeDataBase e=new EmployeeDataBase();
     e.setId(13);
     e.setName("ddddd");
     e.setUsername("ffff");
     e.setPassword("ggggg");
     e.setPhone("1555");
     
     
     EmpService service=new EmpService();
     service.save(e);
 
    
            }
}
             
    

    

    
