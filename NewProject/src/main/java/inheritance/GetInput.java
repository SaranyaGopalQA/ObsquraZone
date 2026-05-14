package inheritance;

import java.util.Scanner;

public class GetInput {
	Scanner sc=new Scanner(System.in);
	double bpay,dedctn,bonus;
	public void get()
	{
		System.out.println("Enter Basic Pay:");
		bpay=sc.nextDouble();
		
		System.out.println("Enter Deduction:");
		dedctn=sc.nextDouble();
		
		System.out.println("Enter Bonus:");
		bonus=sc.nextDouble();
	}

}
