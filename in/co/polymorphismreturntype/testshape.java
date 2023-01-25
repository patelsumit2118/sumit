package in.co.polymorphismreturntype;


public class testshape {
	
	public static void main(String[] args) {
		
	
		
		shape[] s = new shape [3];
		s[0] = new rectangle(10, 20);
		s[1] = new triangle(20, 10);
		s[2] = new circle(25);
		
		int num=1;
		double totalarea = 0;
		
	if (num == 0) {
		System.out.println(s[0].area());
	}
	if (num == 1) {
		System.out.println(s[1].area());
		
	}
	if (num == 2) {
		System.out.println(s[2].area());
	}
	//for (int i = 0; i < s.length; i++) {
		//totalarea = totalarea + s[i].area();
		
	}
}
	
	


	
	
	
	