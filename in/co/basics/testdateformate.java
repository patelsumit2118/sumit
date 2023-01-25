package in.co.basics;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testdateformate {
	private static Date fromat;

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String str = format.format(d);
		System.out.println("Date="+str);
		
		
		String str2 = "21/12/2000";
		
		Date d1=format.parse(str2);
		System.out.println(d1);
		
		
	}

}
