package in.co.inheritance;

public class shapeconstructoetest1 {
	public static void main(String[] args) {
		
		circleconstructor c = new circleconstructor(30, "pink", 50);
		System.out.println(c.getBorderwidth());
		System.out.println(c.getColor());
		System.out.println(c.getRadius());
	}

}
