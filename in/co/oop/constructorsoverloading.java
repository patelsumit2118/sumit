package in.co.oop;

public class constructorsoverloading {
	private String color = null;
	private int borderwidth = 0 ;
	public constructorsoverloading(String color, int borderwidth) {
		super();
		this.color = color;
		this.borderwidth = borderwidth;
	}
	public String getColor() {
		return color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	

}
