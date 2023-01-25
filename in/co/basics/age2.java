package in.co.basics;

import java.time.LocalDate;
import java.time.Period;

public class age2 {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate birthdate = LocalDate.of(2001, 05, 18);
		Period years = Period.between(birthdate, today);
		System.out.println(today);
		System.out.println(birthdate);
		System.out.println(years);
	}

}
