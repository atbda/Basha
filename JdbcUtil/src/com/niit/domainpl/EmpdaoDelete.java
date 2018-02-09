
package com.niit.domainpl;

import com.niit.dao.EmpDao;
import com.niit.dao.EmpDaoDelete;
import com.niit.domain.Emp;
import com.niit.util.Jdbcutil;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EmpdaoDelete implements EmpDaoDelete

{
Jdbcutil util=new Jdbcutil();

    /**
     *
     * @param d
     */
    @Override
    public void delete(Emp d) {
        
    try {
        String sql="delete from emp where id=?";
        PreparedStatement pst = util.createPST(sql);
        
        pst.setInt(1,d.getId());
     

        util.update(pst);
    } catch (SQLException ex) {
        Logger.getLogger(EmpdaoImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

  
   
   
    
  
}
   
    
 
        
    
    
    

