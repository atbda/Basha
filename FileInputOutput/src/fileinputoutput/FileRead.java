
package fileinputoutput;
import java.io.FileReader;  

public class FileRead {
     
  
  
 
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("E:\\b.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    

