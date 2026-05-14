package encapsulation;

public class Bank {
	private int pin;
	
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	
	public int getPin()
	{
		return pin;
	}
		
	public void validatePin()
	{
	
		switch(pin)
		{
		case 1001:
			
		case 1234:
			
		case 1212:
		
			System.out.println("Valid Pin Number");
			break;
		default:System.out.println("Invalid Pin Number");
			
		}
		
	}


}