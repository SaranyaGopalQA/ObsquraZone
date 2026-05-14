package aggregation;

public class Division {
	
	int num1;
	int num2;
	Addition ref;
	public void div(int num1,int num2,Addition ref)
	{
		this.num1=num1;
		this.num2=num2;
		this.ref=ref;
		int div=num1/num2;
		System.out.println("Division:"+div);
	}

	public static void main(String[] args) {
		Addition obj=new Addition();
		Division obj1=new Division();
		obj.sum(48,56);
		obj1.div(90,10,obj);

	}

}
