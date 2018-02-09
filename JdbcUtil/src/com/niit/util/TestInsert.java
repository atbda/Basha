
package com.niit.util;

import com.niit.domain.Emp;
import com.niit.domainpl.EmpdaoDelete;
import java.sql.SQLException;
import com.niit.domainpl.EmpdaoImpl;
import com.niit.domainpl.EmpdaoUpdate;



public class TestInsert {   
    public static void main(String[] args) throws SQLException {
       
        
        
        /*  Emp e=new Emp();
        
        e.setId(99);
        e.setName("dfhh");
        e.setUsername("cnbvvbn");
        e.setPassword("cnnvb");
        e.setPhone("66564");
        
        EmpdaoImpl edao=new EmpdaoImpl();
        edao.save(e);
        
        
        
        
        
        
        Emp d=new Emp();
        
        d.setId(55);
        
        
        EmpdaoDelete dao=new EmpdaoDelete();
        dao.delete(d);
        
        
        
        */
           Emp u=new Emp();
        
        u.setId(22);
        u.setName("Basha");
        u.setUsername("Md");
        u.setPassword("cvbn");
        u.setPhone("0000");
        
        EmpdaoUpdate eao=new EmpdaoUpdate();
       
    
    }
}
   
