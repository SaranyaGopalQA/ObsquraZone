package exceptionExample;

public class CustomException {

	public static void main(String[] args) throws MyException {
		int age=12;
		if (age>18)
		{
			System.out.println("Not Eligible for Voting");
		}
		
		else
		{
			throw new MyException("Not Elegible");
		}

	}

}
