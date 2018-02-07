/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valuein;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author MRuser
 */
public class ValueIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  

       ApplicationContext ctx=new FileSystemXmlApplicationContext("F://SpringValue.xml");
   
       Employee bean = (Employee)ctx.getBean("EmployeeInfo");
        
        bean.EmpInfo();
        
    }
    
}
       
  
