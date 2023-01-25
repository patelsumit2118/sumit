package in.co.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class testperson1 {
	public static void main(String[] args) {
		Date d = new Date("21/12/2000");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.format(d);
		
		
    
		
		
	person1 p = new person1();
	
		p.setName("sumit patel");
		p.setDob(d);
		p.setAddress("indore");
		System.out.println(p.getName());
		System.out.println(p.getDob());
		System.out.println(p.getAddress());
	}

}
