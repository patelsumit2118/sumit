package in.co.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class testperson3 {
	public static void main(String[] args) {
		
		Date d = new Date("21/12/2000");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.format(d);
		person3 p = new person3();
		p.setAddress("indore");
		p.setDob(d);
		p.setName("sumit patel");
		System.out.println(p.getAddress());
		System.out.println(p.getDob());
		System.out.println(p.getName());
	}

}
