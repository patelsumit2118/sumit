package in.co.collectmarksheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class test {
	public static void main(String[] args) {
		 List l = new ArrayList();
		 marksheet1 m1 = new marksheet1("sumit","dc101", 52,52, 25);
		 marksheet1 m2 = new marksheet1("nainshi", "dc102", 85, 75, 63);
		 
		 HashMap map = new HashMap();
		 map.put(m1, "sumit");
		 map.put(m2, "nainshi");
		 
		 System.out.println(map.get(m1));
		 System.out.println(map.get(m2));
		 
		 
		 
		 l.add(m1);
		 l.add(m2);
		 
		 l.remove(m1);
		 System.out.println(l.contains(m1));
		 System.out.println(l.contains(m2));
		 
		 
		 
		 
		 Iterator it = l.iterator();
		 
		 while(it.hasNext()) {
			 marksheet1  m=  (marksheet1)it.next();
			 System.out.print(" "+m.getSumit());
			 System.out.print(" "+m.getRooNo());
			 System.out.print(" "+m.getBusiness());
			 System.out.print(" "+m.getEnglish());
			 System.out.print(" "+m.getAccount());
			 System.out.println();
		 }
		 
	}

}
