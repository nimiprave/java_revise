/**
 * @(#)currencytest.java
 *
 *
 * @author 
 * @version 1.00 2009/4/7
 */

import java.util.*;
import java.text.*;
//import Keyboard.Keyboard;
public class currencytest {

	public static void main(String[] args) {
		boolean gaurd = true;
		while(true){
			System.out.println("Type here:  ");
			String s = Keyboard.readString();
			s.toUpperCase();
			if(s == null){
				gaurd = false;	
			}
			Currency curr = Currency.getInstance(s);
			NumberFormat n = NumberFormat.getCurrencyInstance();
			n.setCurrency(curr);
			double doubleAmount = 12345678.12;
			String sn = n.format(doubleAmount);
			System.out.println("String:   " +sn);
			
		}
/*		Currency curr = Currency.getInstance("USD");
		//NumberFormat n = NumberFormat.getCurrencyInstance(Locale.getDefault());
		NumberFormat n = NumberFormat.getCurrencyInstance();
		n.setCurrency(curr);
		double doubleAmount = 12345678.12;
		String s = n.format(doubleAmount);
		System.out.println("String:   " +s);
		System.out.println(curr.toString());  */
	}
}
