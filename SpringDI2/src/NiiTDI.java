/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MRuser
 */
public class NiiTDI {
    public static void main(String[] args) {
         ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    NiiT bean = context.getBean(NiiT.class);
        System.out.println(bean.getId()+"  "+bean.getName()+"  "+bean.getAddress().getColony()+"  "+bean.getAddress().getHomeNO());
  NIITPortal portal=(NIITPortal)  context.getBean("niit");
        System.out.println(portal.getCentreCode()+"  "+portal.getCentreName()+" \n STUDENT INFO: "+portal.getSlist());
    
    for(Student s:portal.getSlist())
    s.getInfo(); }
}
