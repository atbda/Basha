
package com.niit.domainpl;

import com.niit.dao.EmpDao;
import com.niit.domain.Emp;
import com.niit.util.Jdbcutil;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EmpdaoImpl implements EmpDao

{
Jdbcutil util=new Jdbcutil();
    @Override
    public void save(Emp e) {
        
    try {
        String sql="insert into emp(id,name,username,password,phone) values(?,?,?,?,?)";
        PreparedStatement pst = util.createPST(sql);
        
        pst.setInt(1,e.getId());
        pst.setString(2,e.getName());
        pst.setString(3,e.getUsername());
        pst.setString(4,e.getPassword());
        pst.setString(5,e.getPhone());

        util.update(pst);
    } catch (SQLException ex) {
        Logger.getLogger(EmpdaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public void delete(Emp d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Emp u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
   
    
 
        
    
    
    

