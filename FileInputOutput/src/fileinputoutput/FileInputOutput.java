/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputoutput;

import java.io.FileInputStream;


 
public class FileInputOutput {

    
    public static void main(String[] args) {
        try
        {
FileInputStream fileInputStream=new FileInputStream("E:\\a.txt");   
        int acl=0;
            int avl = fileInputStream.available();
        byte buff[]=new byte[avl];
        fileInputStream.read(buff,0,avl);
        String content=new String(buff);
        System.out.println(content);
        fileInputStream.close();
        
    }
    catch(Exception e)
    {
        System.out.println(" Exception"+e);
    }
    }
}
