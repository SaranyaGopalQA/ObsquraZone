package exceptionExample;

public class Unchecked {

	public static void main(String[] args) {
		
		//Arithmetic Exception
		try
		{
		int a=10;
		int b=0;
		int div=a/b;
		System.out.println(div);
		}
		 catch(ArithmeticException ae)
		{
			 System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
		System.out.println("Exception");
		
		//ArrayOutofBound Exception
		try
		{
		int arr[]= {12,34,45,67,78};
		System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Exception Handled"); 
		}
		
		//NullPointer Exception
		/*String num1=null;
		System.out.println(num1.length());*/
		
		
		
	}

}
