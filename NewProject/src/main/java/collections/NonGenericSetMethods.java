package collections;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
		Set fruits=new HashSet();
	    fruits.add("apple");
	    fruits.add("orange");
	    fruits.add("mango");
	    fruits.add(56);
	    fruits.add('A');
	    fruits.add(23.65);
	    System.out.println(fruits);
	    
	    Set vegs=new HashSet();
	    vegs.add("carrot");
	    vegs.add(47);
	    vegs.add('B');
	    System.out.println(vegs);
	    
	    //addAll()
	    fruits.addAll(vegs);
	    System.out.println(fruits);
	    
	    //contains()
	    System.out.println(fruits.contains(48));
	    
	    //containAll()
	    System.out.println(fruits.containsAll(vegs));
	    System.out.println(vegs.containsAll(fruits));
	    
	    //isEmpty()
	    System.out.println(fruits.isEmpty());
	    
	    //removeall()
	    fruits.removeAll(vegs);
	    System.out.println(fruits);
	    
	    //size()
	    System.out.println(fruits.size());
	    
	    //clear()
	    vegs.clear();
	    System.out.println(vegs);
	    
	    
	    
	    
	    
	    
	    

	}

}
