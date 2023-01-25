package in.co.basics;

import java.time.LocalDate;
import java.time.Period;

public class testtimeage3 {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate birthdate = LocalDate.of(1995, 01, 01);
		int years = Period.between(birthdate, today).getYears();
				System.out.println(today);
		        System.out.println(birthdate);
		        System.out.println(years);
	}

}
