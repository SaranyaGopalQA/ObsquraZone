package stringpckg;

public class SampleString {

	public static void main(String[] args) {
	
		String s="Hello";
		String s4="java";
		String s5="java";
		String s6="Java"; 
		String s7=new String("java");
		String s8=new String("java");
		String s9=" java program ";
		
		int s3 =678;
		System.out.println(s);
		String s1=new String("Hi");
		System.out.println(s1);
		System.out.println(s1.length());  			//length() find the length of String
		System.out.println(s1.charAt(0));			//charAt() find the character
		System.out.println(s1.contains("h"));		//contains() find the character present
		System.out.println(s.concat("world")); 		//concat() add a new string
		System.out.println(s);
		System.out.println(s.toUpperCase());		 //toUpperCase() convert to uppercase
		System.out.println(s.toLowerCase()); 		//toUpperCase() convert to uppercase
		System.out.println(s.isEmpty());			//isEmpty() string is empty or not
		String s2="";
		System.out.println(s2.isEmpty());
		System.out.println(String.valueOf(s3));    //valueOf() convert diff data type in to string
		System.out.println(s4.equals(s5));		    //equals() compare strings
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));   //equalsignorecase() ignore case
		System.out.println(s7.equals(s8));
		System.out.println(s4==s5);
		System.out.println(s7==s8);						//equal operator is used to compare object refrence,it checks 2 variable point to the 
														//same memory location
														//on the other hand equal method is used to compare the value of object
		System.out.println(s9.trim());					//trim() to remove the leading and last space
		
		System.out.println(s9.substring(4));			//substring() to extract the part of string
		System.out.println(s9.substring(5,8));
		
		
	}

}
