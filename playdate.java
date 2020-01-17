import java.sql.Date;
import java.text.*;
import java.lang.*;
import java.util.*;

//import java.util.*;

public class playdate{
	
	
	public static void main(String argsp[]){
		
		
	Locale l = new Locale("en","UK");	
	Date today = new Date(System.currentTimeMillis());
	System.out.println(today);
	String results;
//	SimpleDateFormat formattor = new SimpleDateFormat("yyyy.MM.dd G 'at' hh:mm:ss z",l);
	SimpleDateFormat formattor = new SimpleDateFormat();
	System.out.println(formattor.format(today));
	System.out.println(formattor.toLocalizedPattern());
	}
	
	
	 
	
}





