package in.co.praticecollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class test1 {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		marksheet1 m1 = new marksheet1("nainshi", "ns01", 85, 75, 89);
		marksheet1 m2 = new marksheet1("sumit", "ns02", 75, 49, 79);
		
		HashMap map = new HashMap();
		
		map.put(m1, "nainshi");
		map.put(m2, "sumit");
		
		System.out.println(map.get(m1));
		System.out.println(map.get(m2));
		  
		
		l.add(m1);
		l.add(m2);
		
		l.remove(m1);
		
		System.out.println(l.contains(m1));
		System.out.println(l.contains(m2));
		
		
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			
			marksheet1 m = (marksheet1)it.next();
			
			System.out.print(" "+m.getName());
			System.out.print(" "+m.getRoolNo());
			System.out.print(" "+m.getHindi());
			System.out.print(" "+ m.getEnglish());
			System.out.print(" "+m.getSanskrit());
			System.out.println();
		}
	}

}
