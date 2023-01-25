package in.co.oop;

public class testaccount2 {
	public static void main(String[] args) {
		
		account2 a = new account2();
		a.setName("sumit patel");
		a.setAccounttype("saving");
		a.setNumber(1234455);
		System.out.println(a.getName());
		System.out.println(a.getAccounttype());
		System.out.println(a.getNumber());
		System.out.println(a.diposite(1000));
		System.out.println(a.diposite(500));
		System.out.println(a.diposite(-1));
		System.out.println(a.withdraw(1499));
		System.out.println(a.withdraw(1500));
		System.out.println(a.diposite(2000));
		System.out.println(a.withdraw(1000));
		System.out.println(a.withdraw(1000));
		System.out.println(a.paybill(200));
		System.out.println(a.diposite(201));
		System.out.println(a.paybill(199));
		System.out.println(a.paybill(3));
		System.out.println(a.diposite(3000));
		
	}

}
