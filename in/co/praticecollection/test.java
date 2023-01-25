package in.co.praticecollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class test {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		marksheet m1 = new marksheet("sumit", "ns1", 45, 54, 39);
		
		marksheet m2 = new marksheet("monty", "ns2", 33, 41, 76);
		
		
		HashMap map = new HashMap();
		
		map.put(m1, "sumit");
		
		map.put(m2, "monty");
		
		System.out.println(map.get(m1));
		System.out.println(map.get(m2));
		
		l.add(m1);
		l.add(m2);
		 
		l.remove(m1);
		System.out.println(l.contains(m1));
		System.out.println(l.contains(m2));
		
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			marksheet m = (marksheet)it.next();
			System.out.print(" "+m.getName());
			System.out.print(" "+ m.getRoolNo());
			System.out.print(" "+ m.getAccount());
			System.out.print(" "+ m.getBusiness());
			System.out.print(" "+ m.getAccount());
			System.out.println();
			
		}
		
		
		
		
		
	}

}
