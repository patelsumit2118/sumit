package in.co.collectionframework;

import java.util.ArrayList;

public class interfacelist {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		
		list.add(105);
		list.add(0, "sumit");
		System.out.println(list);
		
		ArrayList i = new ArrayList();
		i.add("sumit");
		System.out.println(i.get(0));
		System.out.println(i.remove(0));
		System.out.println(i.indexOf(i));
		System.out.println(i.lastIndexOf(i));
		System.out.println(i.subList(0, 0));
		
		
		
		
		
		
		
	}

}
