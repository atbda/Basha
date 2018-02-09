/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutput;
import java.io.*;  

/**
 *
 * @author MRuser
 */
public class FileBufferRead { 

  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("E:\\b.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    
    }    
}    
    

