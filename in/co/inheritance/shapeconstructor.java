package in.co.inheritance;

public class shapeconstructor  {
	String color;
	int borderwidth;
	public shapeconstructor () {
		
	}
	public shapeconstructor(String color, int borderwidth) {
		
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


