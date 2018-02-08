/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdi4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author MRuser
 */
public class SpringDI4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
  
        
        ApplicationContext context= new ClassPathXmlApplicationContext("configure.xml");
NIIT Bean = context.getBean(NIIT.class);

  NIIT Center=(NIIT)  context.getBean("NIIT");
        System.out.println(Center.getElist()+"  "+Center.getSlist());
        
        for (Students st : Center.getSlist()) {
            System.out.println(st);
        }
     for (Emp E : Center.getElist()) {
            System.out.println(E);
        }
    
    }
}    
       