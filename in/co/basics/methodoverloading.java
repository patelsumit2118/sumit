package in.co.basics;

public class methodoverloading {
	public static void main(String[] args) {
		
		add(44,41);
		add ("sumit",54);
		add ("patel","sumit");
		
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


