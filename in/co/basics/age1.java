package in.co.basics;

import java.time.LocalDate;
import java.time.Period;

public class age1 {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate birthdate = LocalDate.of(1996, 01, 01);
		Period years = Period.between(birthdate, today);
		System.out.println(today);
		System.out.println(years);
		System.out.println(birthdate);
			
				
	}

}
