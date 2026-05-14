package superKeyword;

public class Division extends Addition {

	public void div(int num1,int num2)
	{
		 int sum=super.add(num1, num2);
		 System.out.println("Sum:"+sum);
		if(sum%10==0)
		{
			System.out.println("Number is divisible by 10");
		}
		else
		{
			System.out.println("Number is not divided by 10");
		}
		
	}
	public static void main(String[] args) {
		Division obj=new Division();
		obj.div(25,25);

	}

}
