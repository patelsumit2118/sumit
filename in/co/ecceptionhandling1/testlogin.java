package in.co.ecceptionhandling1;

public class testlogin {
	public static void main(String[] args) {
		
		String name = "sumit";
		if (name == "sumit") {
			System.out.println("vaild ");
			
		}else {
			try {
				throw new loginexception();
				
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}



