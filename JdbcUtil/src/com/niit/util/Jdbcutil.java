
package com.niit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbcutil {
public static Connection connection;
    static{
    try {
        connection=DriverManager.getConnection("jdbc:derby://localhost:1527/ATOB", "ATOc","asdf");
    } catch (SQLException ex) {
    }
    }
    
    public PreparedStatement createPST(String sql) {
    PreparedStatement pst;
    try {
        pst = connection.prepareStatement(sql);
            return pst;

    } catch (SQLException ex) {
}
return null;    
    }

public void update(PreparedStatement pst){
    try {
        pst.executeUpdate();
    } catch (SQLException ex) {
}
}

   


}


   

