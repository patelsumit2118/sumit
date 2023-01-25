package in.co.exceptionhandling;

public class testlogin1 {
	public static void main(String[] args) {
		
		String name = "sumit";
		
		if(name == "sumi") {
		
			System.out.println("vaild");
		}else {
			try {
				throw new exceptionlogin();
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
