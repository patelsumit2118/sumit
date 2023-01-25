package in.co.basics;

public class methodoverloading2 {
	public static void main(String[] args) {
		
		add(23,34);
		add("nainshi",18);
		add("nainshi","sumit");
		
	}

	private static void add(String string, String string2) {
		System.out.println(string+string2);
		
	}

	private static void add(String string, int j) {
		System.out.println(string+j);
	}

	private static void add(int i, int j) {
		System.out.println(i+j);
		
		
		
		
	}
		
}
