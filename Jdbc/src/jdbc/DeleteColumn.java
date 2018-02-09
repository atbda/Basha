
package jdbc;
import java.sql.*;


public class DeleteColumn {
    
  
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
      String driver="org.apache.derby.jdbc.ClientDriver";
      String url="jdbc:derby://localhost:1527/ATOB";
      String user="ATOc";
      String password="asdf";
      
      Class.forName(driver);
      
      Connection con=DriverManager.getConnection(url,user,password);
      System.out.println(con);
      String sql="delete from  employeedatabase  where id=12";
      Statement st=con.createStatement();
      st.executeUpdate(sql);
      System.out.println("Done");
      st.close();
      con.close();
    }
    
}

