package in.co.basics;

public class stringbuffer {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("vijay");
	sb.append("Dinanath Chauhan");
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	System.out.println(sb.charAt(1));
	System.out.println(sb.indexOf("Dinanth"));
	System.out.println(sb.replace(0,5,"shri"));
	System.out.println(sb.reverse());
	
}
}
