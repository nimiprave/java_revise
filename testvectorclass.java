/**
 * @(#)testvectorclass.java
 *
 *
 * @author 
 * @version 1.00 2008/12/11
 */
import java.util.*;

public class testvectorclass {
        
    /**
     * Creates a new instance of <code>testvectorclass</code>.
     */
    public testvectorclass() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector v = new Vector();
        v.addElement("nirmal");
        v.addElement("Shyam");
        v.addElement("Sujana");
        v.addElement("Sumathi");
        
        if(v != null){
        
        for(int i=0; i < v.size();i++){
        	System.out.println(v.elementAt(i));
        }
        }
        
        v.removeAllElements();
        
        if (v == null){
        	System.out.println("Reached Null");
        //	System.out.println(v.toString());
        }
        
        System.out.println(" Attempt Two"  );
        if(v.isEmpty()){
        	System.out.println("Is Empty");
        	System.out.println(v.toString());
        }
                
        v.addElement("nirmal");
        v.addElement("Shyam");
        v.addElement("Sujana");
        v.addElement("Sumathi");
 		 
 		for(int i=0; i < v.size();i++){
        	System.out.println(v.elementAt(i));
        }   
        
        
        // Testing the String array.
        int i = 0;
        while(i < 5){
        String [] array =  { "inside array"};
        System.out.println(array[0]);
        array = null;
        i++;
        }
     
             
        
        
    }
}
