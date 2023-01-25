package in.co.overridingconstructor;



public class testrectangle {
	public static void main(String[] args) {
		
		rectangle r = new rectangle(20, 25, "black", 30);
		System.out.println(r.area());
		
		circle c = new circle(40, "blue", 30);
		System.out.println(c.area1());
		
		
		
		triangle t = new triangle(8,5, "red", 25);
		System.out.println(t.area2());
		
		
		
		
	}

}
