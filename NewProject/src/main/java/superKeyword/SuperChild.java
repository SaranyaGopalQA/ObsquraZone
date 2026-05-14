package superKeyword;

public class SuperChild extends SuperInstance {
	
	String color="White";
	
	public void display()
	{
		System.out.println(super.color);
	}
	
	public void show()
	{
		System.out.println("Child class Method");
		super.show();
		super.get();
		System.out.println("Sum:"+super.add(24,36));
	}
	public static void main(String args[])
	{
		SuperChild obj= new SuperChild();
		System.out.println(obj.color);
		obj.display();
		obj.show();
		
	}

}
