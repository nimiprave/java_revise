/**
 * @(#)testexception.java
 *
 *
 * @author 
 * @version 1.00 2008/12/5
 */
import java.io.*;
import java.lang.*;

public class testexception {
        
    /**
     * Creates a new instance of <code>testexception</code>.
     */
    public testexception() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] value = {1,2};
        
        try{
        	int newvalue = value[2];
        }catch(Exception es){
        	System.out.println("Entered Exception Block: ");
        	try{
        		FileWriter fr = new FileWriter("C:\\Documents and Settings\\I820262\\Desktop\\java_revise\\writeException.txt",true);
        		PrintWriter pr = new PrintWriter(fr);
        		//pr.println(es.toString());
        		pr.println("writing to the file");
        		es.printStackTrace(pr);
        		System.out.println("Exception Completed Succesfully");
        	}catch(IOException e){
        		;
        	}
        }
        
        
    }
}
