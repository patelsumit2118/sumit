

package in.co.exceptionhandling;

public class testlogin {
	public static void main(String[] args) {
		
		String name = "admi";
		
		if (name == "admin") {
			System.out.println("vaild");
		}else {
			try {
				throw new loginexception();
			}catch (Exception e) {
				//System.out.println("hello");
				System.out.println(e.getMessage());
			
			}
		}
		
	}

}
