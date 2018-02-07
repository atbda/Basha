/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdi3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author MRuser
 */
public class SpringDI3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Emp bean = context.getBean(Emp.class);
        System.out.println(bean.getId()+"  "+bean.getName()+"  "+bean.getAddress().getColony()+"  "+bean.getAddress().getHomeNO());
  NIITPortal portal=(NIITPortal)  context.getBean("niit");
        System.out.println(portal.getCentreCode()+"  "+portal.getCentreName()+" \n STUDENT INFO: "+portal.getSlist());
    
    for(Student s:portal.getSlist())
    s.getInfo();
    
    }
    
}
