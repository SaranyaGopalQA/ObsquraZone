package aggregation;

public class Addition {
	
	int num1;
	int num2;
	
	
	public void sum(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		int sum=num1+num2;
		System.out.println("Sum:"+sum);
	}

}
