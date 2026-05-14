package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		
		Set<String>set=new HashSet<String>();
		set.add("apple");
		set.add("orange");
		set.add("grapes");
		set.add("mango");
		System.out.println(set);
		
		//Iterator iteratorname=collectionname.iterator();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(set);

	}

}
