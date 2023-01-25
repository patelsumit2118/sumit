package in.co.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testdateformat1 {
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String str = format.format(d);
		System.out.println("date"+str);
		
		String st = new String("22/05/1993");
		Date d4 = format.parse(st);
		System.out.println(d4);
		
	}

}
