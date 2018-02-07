/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


public class SpringPrac {

    
    public static void main(String[] args) {
      // Triangle triangle=new Triangle();
       BeanFactory  factory =new XmlBeanFactory(new ClassPathResource("spring.xml"));
     //  Triangle triangle = (Triangle)factory.getBean("triangle");
        
         
        
       // triangle.draw();
        
        EmpService es=(EmpService) factory.getBean("empService");
        es.reg();
    }
    
}
