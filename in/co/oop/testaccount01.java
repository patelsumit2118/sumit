package in.co.oop;

public class testaccount01 {
	public static void main(String[] args) {
		account1 a=new account1();
		System.out.println(a.getBalance());
		System.out.println(a.diposite(-1000));
		System.out.println(a.diposite(1000));
		System.out.println(a.diposite(500));
		
	}

}

