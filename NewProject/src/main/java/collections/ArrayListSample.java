package collections;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(68);
		al.add(47);
		al.add(32);
		al.add(74);
		System.out.println(al);
		
		int large=al.get(0);
		for(int i=0;i<al.size();i++)
		{
			
			if(al.get(i)>large)
			{
				large=al.get(i);
				
				
			}
		}
		
		System.out.println("laregest:"+large);
	}

}
