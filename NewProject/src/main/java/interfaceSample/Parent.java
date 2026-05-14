package interfaceSample;

public interface Parent {
	public static final int a=2;
	int b=3;
	public abstract void display();
	
	default void sum(int a,int b)
	{
		//a=5;
		//b=6; treat as constant
		int sum=a+b;
		System.out.println("Sum:"+sum);
		
	}
	
	public static void diff(int a,int b)
	{
		int diff=a-b;
		System.out.println("Diff:"+diff);
	}
	
	

}
