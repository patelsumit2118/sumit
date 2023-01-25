package in.co.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testdatefomate {
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
		String str = format.format(d);
		System.out.println("Date"+str);
		
		String str1 = "21/12/2000";
		
			Date d1 = format.parse(str1);
			System.out.println(d1);
	
			
	}
}
				
			
		
		
		
	

