package exceptionExample;

import java.io.IOException;
import java.util.Scanner;

public class AtmThrow {

	public static void main(String[] args) {
		int balance=0;
		int amount=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Balance:");
		balance=sc.nextInt();
		System.out.println("Enter the Amount to withdraw:");
		amount=sc.nextInt();
		try
		{
			System.out.println("Enter the Amount:");
		if(amount>balance)
		{
			System.out.println("Insuffient Balance");
		}
		else
		{
			int rembal=balance-amount;
			System.out.println("Balance:"+rembal);
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled"+e);
		}

	}

}
