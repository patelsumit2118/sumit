package in.co.basics;

import java.util.Calendar;
import java.util.Date;

public class datecalender {
	public static void main(String[] args) {
		
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		int dayofyear = cal.get(Calendar.ALL_STYLES);
		cal.add(Calendar.DATE,-1);
		Date yesterday = cal.getTime();
		
	}
	
}
