import java.util.*;
import java.text.*;

public class testdate {

   static public void displayDate(Locale currentLocale) {

      Date today;
      String result;
      SimpleDateFormat formatter;

      formatter = new SimpleDateFormat("EEE d MMM yy", currentLocale);
     // formatter = new SimpleDateFormat("yyyy.mm.dd",currentLocale);
      today = new Date();
      result = formatter.format(today);

      System.out.println("Locale: " + currentLocale.toString());
      System.out.println("Result: " + result);
   }


   static public void displayPattern(String pattern, Locale currentLocale) {

      Date today;
      SimpleDateFormat formatter;
      String output;

      formatter = new SimpleDateFormat(pattern, currentLocale);
      today = new Date();
      output = formatter.format(today);

      System.out.println(pattern + "   " + output);
   }
   
   
   static public void displaypatternonly(String pattern){
   	Date today;
   	SimpleDateFormat formatter;
   	String output;
   	formatter = new SimpleDateFormat(pattern);
   	today = new Date();
   	System.out.println(today);
   }

   static public void main(String[] args) {

      Locale[] locales = {
          new Locale("fr","FR"),
          new Locale("de","DE"),
          new Locale("en","US"),
          new Locale("en","UK")
      };

      for (int i = 0; i < locales.length; i++) {
         displayDate(locales[i]);
         System.out.println();
      }

      String[] patterns = {
         "dd.MM.yy",
         "yyyy.MM.dd G 'at' hh:mm:ss z",
         "EEE, MMM d, ''yy",
         "h:mm a",
         "H:mm",
         "H:mm:ss:SSS",
         "K:mm a,z",
         "yyyy.MMMMM.dd GGG hh:mm aaa"
      };

      for (int k = 0; k < patterns.length; k++) {
         displayPattern(patterns[k], new Locale("en","US"));
         System.out.println();
      }


		for(int k=0;k<locales.length;k++){
			displayPattern("yyyy.MM.dd G 'at' hh:mm:ss z",locales[k]);
			System.out.println();
		}
		
		
		
		System.out.println("Displaying the patterns for the locale us");
		
		for(int k=0;k<patterns.length;k++){
			displaypatternonly(patterns[k]);
			System.out.println();
		}

      System.out.println();
   }
}