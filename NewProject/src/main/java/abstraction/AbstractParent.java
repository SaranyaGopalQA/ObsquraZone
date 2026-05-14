package abstraction;

public abstract class AbstractParent {
	
	
	public AbstractParent()
	{
		System.out.println("Constructor");
	}
	public abstract void display();
	public abstract void sum(int num1,int num2);
	
	
	public void show()
	{
		System.out.println("This is non Abstract method");
	}
	
	

}
