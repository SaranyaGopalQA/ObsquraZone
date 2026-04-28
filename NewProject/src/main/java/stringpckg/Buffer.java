package stringpckg;

public class Buffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello ");
		StringBuilder sd=new StringBuilder("Hi");
		System.out.println(sb);
		System.out.println(sd);
		
		System.out.println(sb.insert(6,"world" )); 		//insert() to insert new string based on index position
		System.out.println(sb.append(" java"));			//append()  to add a new string at the last
		System.out.println(sd.append(sb));
		System.out.println(sd.replace(2,7,"saranya"));	//replace() to replace the string
		System.out.println(sd.delete(2,9));				//delete() to delete particular word
		System.out.println(sb.reverse());				//reverse() to reverse a string

	}

}
