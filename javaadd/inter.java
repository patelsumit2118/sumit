package in.co.javaadd;

import javax.swing.plaf.metal.DefaultMetalTheme;

@FunctionalInterface
public interface inter {
	
	public int add (int a , int b);
	
	
	public default   void defmethod() {
		System.out.println("i am default method");
	}
	public static void Static() {
		System.out.println("i am static mathod");
		
	}
	
	

}
