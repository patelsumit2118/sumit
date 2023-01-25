package in.co.polymorphismusingarray;



public class testshape {
	public static void main(String[] args) {
		
		shape[] s = new shape [3];
		s[0] = new rectangle(10, 20);
		s[1] = new triangle(20, 10);
		s[2] = new circle(25);
		
		double totalarea = 0 ;
		for (int i = 0; i < s.length; i++) {
			totalarea = totalarea + s[i].area();
			
		}
		System.out.println(totalarea);
		
		
	}
	
	
	
	
}
