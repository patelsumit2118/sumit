package in.co.inheritance;

public class shapeconstructortest1 {
	public static void main(String[] args) {
		triangleconstructor t = new triangleconstructor(30, 20, "black", 40);
		System.out.println(t.getBase());
		System.out.println(t.getBorderwidth());
		System.out.println(t.getColor());
		System.out.println(t.getHeight());
	}

}
