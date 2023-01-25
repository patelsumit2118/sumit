package in.co.polymorphismreturntype;

public class triangle extends shape {
	int base;
	int hight;
	public triangle(int base, int hight) {
		super(base);
		this.base = base;
		this.hight = hight;
	}
	public double area() {
		double tarea = base* hight;
		System.out.println("circle area = "+ tarea);
		return tarea;
	}

}
