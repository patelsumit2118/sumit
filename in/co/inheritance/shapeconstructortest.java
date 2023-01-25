package in.co.inheritance;

public class shapeconstructortest {
	public static void main(String[] args) {
		
		rectangleconstructor r = new rectangleconstructor(20, 30, "red", 40);
		System.out.println(r.color);
		System.out.println(r.borderwidth);
		System.out.println(r.length);
		System.out.println(r.width);
		
	}

}
