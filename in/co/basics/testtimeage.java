package in.co.basics;

import java.time.LocalDate;
import java.time.Period;

public class testtimeage {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now(); 
		 LocalDate birthDate = LocalDate.of(2000, 12, 21);
		int years = Period.between(birthDate, today).getYears();
		 System.out.println(years);
	}

	

}
