
package com.niit.domainpl;

import com.niit.dao.EmpDao;
import com.niit.domain.Emp;
import com.niit.util.Jdbcutil;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MRuser
 */
public class EmpdaoUpdate implements EmpDao

{
Jdbcutil util=new Jdbcutil();

    /**
     *
     * @param u
     */
    @Override
    public void update(Emp u) {
        
    try {
        String sql="UPDATE emp SET name=?,username=?,password=?,phone=?  WHERE id= ?";
        PreparedStatement pst = util.createPST(sql);
        
        pst.setString(1,u.getName());
        pst.setString(2,u.getUsername());
        pst.setString(3,u.getPassword());
        pst.setString(4,u.getPhone());
        pst.setInt(5,u.getId());

        util.update(pst);
    } catch (SQLException ex) {
        Logger.getLogger(EmpdaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @Override
    public void save(Emp e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Emp d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




   
  
}
   
    
 
        
    
    
    

