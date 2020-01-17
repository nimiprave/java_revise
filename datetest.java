/**
 * @(#)datetest.java
 *
 *
 * @author 
 * @version 1.00 2008/6/3
 */
import java.lang.*;
import java.text.*;


public class datetest {

    public datetest() {
    }
    
    public static void main(String args[]){
    	
    	Date d = new Date();
    	SimpleDateFormat simpledateformat = new SimpleDateFormat(d);
    	System.out.pritnln(simpeldateformat);
    }
}