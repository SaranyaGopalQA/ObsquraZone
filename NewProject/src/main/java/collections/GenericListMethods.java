package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		//add() to add elements in to list
		list.add("Anu");
		list.add("Manu");
		list.add("Vinu");
		list.add("Tanu");
		list.add("Anu");
		System.out.println(list);
		
		//get() used to get an element at the specified index
		System.out.println(list.get(2));
		
		//set() used to set a new element by replacing the existing
		list.set(1,"kiran");
		System.out.println(list);
		
		//indexOf() used to fin the first occurrence of an element
		System.out.println(list.indexOf("Anu"));
		
		//lastIndexOf() used to find the last occurrence of an element
		System.out.println(list.lastIndexOf("Anu"));
		
		//remove used to remove an element(index,element)
		list.remove(3);
		System.out.println(list);
		list.remove("Vinu");
		System.out.println(list);
		
		//contains() used to check whether an element is present or not in the list
		System.out.println(list.contains("Manu"));
		
		//isEmpty() to check whether the given list is empty or not
		System.out.println(list.isEmpty());
		
		//size() to get the count of element
		System.out.println(list.size());
		
		List<Integer>num=new ArrayList<Integer>();
		num.add(3);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(4);
		System.out.println(num);
		
		num.remove(4);
		System.out.println(num);
		
		
		
	}

}
