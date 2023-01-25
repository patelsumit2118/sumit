package in.co.basics;

import java.time.LocalDate;
import java.time.Period;

public class age {
	public age() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthdate = LocalDate.of(2004, 0, 2);

		int years = Period.between(birthdate, today).getYears();
		System.out.println(years);
		System.out.println(birthdate);
		System.out.println(today);

	}

}
