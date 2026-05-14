package exceptionExample;

public class ThrowsExample {

	public static void main(String[] args) throws Exception {
		int age=12;
		if (age>18)
		{
			System.out.println("Not Eligible for Voting");
		}
		
		else
		{
			throw new Exception("Not Elegible");
		}

	}

}
