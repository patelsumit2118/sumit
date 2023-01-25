package in.co.exceptionhandling;

public class praticeexeption {
	public static void main(String[] args) {
		
		String s = "patelsumit";
		try {
		System.out.println(s.length());
		System.out.println(s.charAt(6));
		
		
	}catch (StringIndexOutOfBoundsException e) {
		System.out.println("naam bhot chota hai");
		
		
	}finally {
		System.out.println("bhot payara naam hai"
				+ "");
	}

}
}


