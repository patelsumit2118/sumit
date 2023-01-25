package in.co.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class testperson2 {
	public static void main(String[] args) {
		
		Date d = new Date("2/1/2001");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.format(d);
		person2 p = new person2();
		p.setName("sumit patel");
		p.setAddress("indore");
		p.setDob(d);
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getDob());
	}

}
