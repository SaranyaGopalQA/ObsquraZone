package polymorphism;

public class OffSeason {
	
	public double discount(double amount)
	{
		double discount=amount*0.15;
		double totalAmount=amount-discount;
		return totalAmount;
	}

}
