package collections;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		//add()
		list.add("John");
		list.add(12);
		list.add('A');
		list.add(89.09);
		list.add("Eric");
		list.add(32);
		list.add('A');
		
		System.out.println(list);
		
		//get()
		System.out.println(list.get(2));
		
		//set()
		list.set(1,25);
		System.out.println(list);
		
		//indexOf()
		System.out.println(list.indexOf('A'));
		
		//lastIndexOf()
		System.out.println(list.lastIndexOf('A'));
		
		//remove()
		list.remove(5);
		System.out.println(list);
		
		//contains()
		System.out.println(list.contains("Eric"));
		
		//isEmpty()
		System.out.println(list.isEmpty());
		
		//size()
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.size());
		
	}

}
