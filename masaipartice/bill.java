package masaipartice;

public class bill {
	public static void main(String[] args) {
		
		var discount_1 = 500;
		var discount_2 = 1000;
		var total_bill =1000;
		
		if(total_bill>= discount_2) {
			System.out.println("20%discount");
		}
		
		else if(total_bill>= discount_1) {
			System.out.println("10%discount");
		}
		else{
			System.out.println("no discount");
			
		}
		
	}

}
