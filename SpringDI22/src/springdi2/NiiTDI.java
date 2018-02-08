package springdi2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class NiiTDI {
    public static void main(String[] args) {
        
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
NIITCenter Bean=context.getBean(NIITCenter.class);

  NIITCenter Center=(NIITCenter)  context.getBean("NIITCenter");
        System.out.println(Center.getNlist()+"  "+Center.getSlist());
        
        for (Student st : Center.getSlist()) {
            System.out.println(st);
        }
    
    }
}        