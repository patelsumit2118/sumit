package in.co.inheritance;

public class shapetest2 {
	public static void main(String[] args) {
		
		triangle t = new triangle ();
		t.setHight(25);
		t.setBase(10);
		System.out.println(t.getHight());
		System.out.println(t.getBase());
		System.out.println(t.getHight()* t.getBase());
	}

}
