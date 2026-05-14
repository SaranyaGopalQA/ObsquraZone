package superKeyword;

public class SuperInstance {
 String color="Black";
 public void show()
 {
	System.out.println("Parent class method"); 
	
 }
 
 public void get()
 {
	 System.out.println("Parent instance method");
 }
 
 public int add(int num1,int num2)
 {
	 int sum=num1+num2;
	 return sum;
 }
}
