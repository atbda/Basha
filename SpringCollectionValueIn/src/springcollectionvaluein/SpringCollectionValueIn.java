/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springcollectionvaluein;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author MRuser
 */
public class SpringCollectionValueIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringCollection.xml");
      SpringCollection SC=(SpringCollection)context.getBean("SpringCollection");

        System.out.println(SC.getAddressList());
        System.out.println(SC.getAddressSet());
        System.out.println(SC.getAddressMap());
     
   }
}
    