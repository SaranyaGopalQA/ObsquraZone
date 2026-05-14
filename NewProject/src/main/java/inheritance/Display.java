package inheritance;

public class Display extends Salary {
	public void display()
	{
		System.out.println("SALARY SLIP");
		System.out.println("Basic Pay:"+bpay);
		System.out.println("HRA:"+hra);
		System.out.println("PF"+pf);
		System.out.println("Deduction:"+dedctn);
		System.out.println("Bonus:"+bonus);
		System.out.println("Total Salary:"+salary);
	}

}
