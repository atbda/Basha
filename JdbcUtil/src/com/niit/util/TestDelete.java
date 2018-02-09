/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.util;

import com.niit.domain.Emp;
import com.niit.domainpl.EmpdaoDelete;
import com.niit.domainpl.EmpdaoImpl;
import java.sql.SQLException;


public class TestDelete {
 
    public static void main(String[] args) throws SQLException {
       
                   Emp d=new Emp();
        
        d.setId(47);
      
        EmpdaoDelete eedao=new EmpdaoDelete();
        eedao.delete(d);
          
        
       
    
    }
}
   

    

