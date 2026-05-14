package polymorphism;

public class OnSeason extends OffSeason{
	
	public double discount(double amount)
	{
		System.out.println("Amount after Offseason 15% Discount:"+super.discount(amount));
		double discount=amount*0.40;
		double totalAmount=amount-discount;
		return totalAmount;
		
	}

	public static void main(String[] args) {
		OnSeason obj=new OnSeason();
		System.out.println("Amount after Onseason  40% Discount:"+obj.discount(1000));
			

	}

}
