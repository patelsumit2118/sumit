package in.co.oop;

public class testaccount {
	public static void main(String[] args) {
		
		account a = new account();
		a.setName("sumit patel");
		a.setAccounttype("saving account");
		a.setNumber("132456788990654");
		a.setBalance("1000");
		System.out.println(a.getAccounttype());
		System.out.println(a.getName());
		System.out.println(a.getBalance());
		
	}

}
