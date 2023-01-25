package in.cooverloading;

public class overloading {
	public static void main(String[] args) {
		
		add(21,23);
		add("sumit",21);
		add("sumit","nainshi");
		add("sumit",21,"nainshi",18);
	}

	private static void add(String string, int i, String string2, int j) {
		System.out.println(string+i+string2+j);
	}

	private static void add(String string, String string2) {
		System.out.println(string +  string2 );
	}

	private static void add(String string, int j) {
		System.out.println(string+j);
		
	}

	private static void add(int i, int j) {
		System.out.println(i+j);
		
	}

}
