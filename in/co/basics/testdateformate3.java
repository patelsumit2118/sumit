package in.co.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class testdateformate3 {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat format= new SimpleDateFormat;
		String str = format.format(d);
		System.out.println(d+str);
		
		String str2 = "21/12/2000";
		Date d2 = format.parse(str2);
		System.out.println(d2+str2);
		
		
	}
 
}
