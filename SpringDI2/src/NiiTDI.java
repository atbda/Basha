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
    }
}
