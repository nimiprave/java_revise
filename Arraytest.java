/**
 * @(#)Arraytest.java
 *
 *
 * @author 
 * @version 1.00 2008/4/24
 */

import java.util.*;
public class Arraytest {

    public Arraytest() {
    }
    
    public static void main(String args[]){
    	Random ra = new Random(50);
    	int[] a = new int[ra.nextInt(40)];
    	
    	System.out.println("Length of the Array:" +a.length);
    		for( int i=0; i<a.length;i++){
    		a[i] = (int)ra.nextInt(40);	
    		System.out.println(a[i]);
    	}
    	
    
    }
    
}