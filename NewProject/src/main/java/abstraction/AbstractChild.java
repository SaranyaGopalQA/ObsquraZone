package abstraction;

public class AbstractChild extends AbstractParent{
	
	

	public static void main(String[] args) {
		AbstractParent obj=new AbstractChild();
		AbstractChild obj1=new AbstractChild();
		obj1.get();
		obj.display();
		obj.sum(25,27);
		obj.show();
		

	}

	@Override
	public void display() {
		System.out.println("This is Abstract Method");
		
	}

	@Override
	public void sum(int num1, int num2) {
		int sum=num1+num2;
		System.out.println(sum);
	}
	
	public void get()
	{
		System.out.println("Child method");
	}

}
