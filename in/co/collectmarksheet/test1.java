package in.co.collectmarksheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class test1 {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		
		marksheet2 m1 = new marksheet2("kapil", "dc100", 85, 65, 95);
		marksheet2 m2 = new marksheet2("hiten", "dc101", 75, 85, 92);
		
		
		HashMap map = new HashMap();
		
		
		map.put(m1, "kapil");
		map.put(m2, "hiten");
		
		System.out.println(map.get(m1));
		System.out.println(map.get(m2));
		
		l.add(m1);
		l.add(m2);
		
		l.remove(m1);
		
		System.out.println(l.contains(m1));
		System.out.println(l.contains(m2));
		
		
		
		
		Iterator it = l.iterator();
		
		
		while (it.hasNext()) {
			
			
			marksheet2 m = (marksheet2)it.next();
			
			
			System.out.print(" "+m.getName());
			System.out.print(" "+m.getRollNo());
			System.out.print(" "+m.getHindi());
			System.out.print(" "+m.getEnglish());
			System.out.print(" "+m.getSanskrit());
			System.out.println();
		}
	}

}
