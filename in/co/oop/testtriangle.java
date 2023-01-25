package in.co.oop;

public class testtriangle {
	public static void main(String[] args) {
		
		triangle t = new triangle();
		t.setLength(20);
		t.setHeight(30);
		t.setWidth(20);
		
		System.out.println(t.getHeight());
		System.out.println(t.getLength());
		System.out.println(t.getWidth());
		System.out.println("totalarea="+ t.getHeight()* t.getLength()* t.getWidth());
	}

}
