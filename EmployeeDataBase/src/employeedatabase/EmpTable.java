package employeedatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpTable {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/ATOB";
        String user = "ATOc";
        String password = "asdf";

        Class.forName(driver);

        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println(con);
        String sql = "create table  E(id int ,name varchar(222),username varchar(222),password varchar(222),phone varchar(44))";
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        System.out.println("Done");
        st.close();
        con.close();
    }

}
