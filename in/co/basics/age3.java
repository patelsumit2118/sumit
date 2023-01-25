package in.co.basics;

import java.time.LocalDate;
import java.time.Period;

public class age3 {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate BirthDate = LocalDate.of(2003, 8, 11);
		Period years = Period.between(BirthDate, today);
		System.out.println(today);
		System.out.println(BirthDate);
		System.out.println(years);
	}
	

}
