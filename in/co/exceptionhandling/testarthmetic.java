package in.co.exceptionhandling;

public class testarthmetic {
	public static void main(String[] args) {
		
		int k =0;
				
		 int i = 15;
		 try {
		 double div = i/k;
		 System.out.println(div);
		 } catch (ArithmeticException e) {
			// TODO: handle exception
			 System.err.println("i is not divisible by zero");
			 
		}finally {
			System.out.println("my name is sumit");
		}
		 

}
}

