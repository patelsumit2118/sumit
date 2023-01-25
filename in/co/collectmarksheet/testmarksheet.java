package in.co.collectmarksheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;



public class testmarksheet {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		marksheet m1 = new marksheet("dc102", "sumit", 33, 43, 37);
		marksheet m2 = new marksheet("dc103", "monty", 35, 45, 34);
		
		HashMap map = new HashMap();
		map.put(m1, "sumit");
		map.put(m2, 33);
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
			System.out.print(" "+m.getRoolNo());
			System.out.print(" "+m.getChemistry());
			System.out.print(" "+m.getPhyics());
			System.out.print(" "+m.getMaths());
			System.out.println();
		}
	}

}
