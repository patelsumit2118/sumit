package in.co.collectionframework;

import java.util.ArrayList;

public class collection {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
			list.add(1);
			
				list.add(101);
				list.add("sumit");
			    list.add('c');
			    list.add(true);
			    list.add(1020);

			    System.out.println(list);
				
				
				
				
			    ArrayList l= new ArrayList();
			    l.add("amit");
			    l.add(1);

			    
			    l.addAll(list);
			    
			    
                System.out.println(l);
                
                l.contains(list);
                boolean ans= l.contains("amit");
                System.out.println(ans);
                System.out.println(l.isEmpty());
                System.out.println(l.remove(0));
                System.out.println(l.size());
                System.out.println(l.containsAll(l));
                System.out.println(l.contains("sumit"));
                System.out.println(l.iterator());
                System.out.println(l.retainAll(l));
                
                
                

			}
			
		    
		}
		
		
		
		
	

