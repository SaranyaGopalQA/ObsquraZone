package collections;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set<String>set=new HashSet<String>();
		set.add("apple");
		set.add("orange");
		set.add("grapes");
		set.add("mango");
		
		System.out.println(set);
		
		//addAll used to add all elements of one set to another set
		
		Set<String>set1=new HashSet<String>();
		set1.add("Brocolli");
		set1.add("cabage");
		set1.add("carrot");
		
		//addAll
		 set.addAll(set1);
		 System.out.println(set);
		 
		 //contains() to check given element is present or not
		 
		 System.out.println(set.contains("carrot"));
		 System.out.println(set1.contains("mango"));
		 
		 //containsAll() used to check whether all the element of one set is present or not in another set
		 System.out.println(set.containsAll(set1));
		 System.out.println(set1.containsAll(set));
		 
		 //isEmpty
		 System.out.println(set.isEmpty());
		 
		 //remove
		 set.remove("mango");
		 System.out.println(set);
		  
		 //removeAll used to remove all element of one set from another set
		 set.removeAll(set1);
		 System.out.println(set);
		 
		 //size() to count number of element
		 System.out.println(set.size());
		 
		 //clear() delete all the element but memory remains
		 set1.clear();
		 System.out.println(set1);
		 
		 
		 
			
		
	}

}
