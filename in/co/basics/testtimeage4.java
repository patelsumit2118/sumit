package in.co.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;

public class testtimeage4 {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
		String str = format.format(d);
		System.out.println(d);
		String str1 = "21/12/2000";
		Date d1 = format.parse(str1);
		System.out.println(d1);
		Period years = Period.ofYears(1); 
		System.out.println(years);
		
	}
	
	
}

	


