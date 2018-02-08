package springdi2;


import springdi2.NIITCenter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class NiiTDI {
    public static void main(String[] args) {
         ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
              1  bean = context.getBean(NIIT.class);
        System.out.println(bean.getNlist()+"  "+bean.getSlist());
  NIITCenter Center=(NIITCenter)  context.getBean("NIITCenter");
         System.out.println(Center.setNlist()+"  "+Center.getSlist()+" \n STUDENT INFO: "+Center.getSlist());
    

   
    for(Student ST:Center.getSlist())
    ST.getInfo();
    
    
    }
}
