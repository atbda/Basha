
package fileinputoutput;
import java.io.*;  


public class FileWrite {
   


public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("E:\\b.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to Java World.");  
    buffer.close();  
    System.out.println("Success");  
    }  
}  
