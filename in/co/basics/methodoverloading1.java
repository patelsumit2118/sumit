package in.co.basics;

public class methodoverloading1 {
	public static void main(String[] args) {
		
		add(324,654);
		add("rani",321);
		add("maharani","maharaj");
		add("rani","laxami","bai");
		add("ashta",150,"sheore",175,"bhopal",300);
		
		
	}

	private static void add(String string, int i, String string2, int j, String string3, int k) {
		System.out.println(string+150+string2+j+string3+k);
	}

	private static void add(String string, String string2, String string3) {
		System.out.println(string+string2+string3);}

	private static void add(String string, String string2) {
		System.out.println(string+string2);
	}

	private static void add(String string, int j) {
		System.out.println(string+j);
	}

	private static void add(int i, int j) {
		System.out.println(i-j);
	}

}
