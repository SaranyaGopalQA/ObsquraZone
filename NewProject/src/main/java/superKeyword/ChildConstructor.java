package superKeyword;

public class ChildConstructor extends ParentConstructor{
	public ChildConstructor()
	{
		super();
		
		System.out.println("Child");
	}
	public ChildConstructor(int num1,int num2)
	{
		int sum=num1+num2;
		System.out.println(sum);
		
	}


	public static void main(String[] args) {
		ChildConstructor obj=new ChildConstructor();
		ChildConstructor obj1=new ChildConstructor(24,25);
		
		


	}

}
