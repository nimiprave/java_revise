/**
 * @(#)fileWriterTest.java
 *
 *
 * @author 
 * @version 1.00 2008/12/19
 */
import java.io.*;
import java.lang.*;
public class fileWriterTest {
        
    /**
     * Creates a new instance of <code>fileWriterTest</code>.
     */
    public fileWriterTest() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
        	FileWriter fr = new FileWriter("C:\\Documents and Settings\\I820262\\Desktop\\java_revise\\writeException.txt",true);
        	PrintWriter pr = new PrintWriter(fr);
        	pr.println("Please print");
        	pr.println("print again");
        	 pr.close();       	
        	
        }catch(IOException e){;}
        
      //  pr.close();
    }
}
