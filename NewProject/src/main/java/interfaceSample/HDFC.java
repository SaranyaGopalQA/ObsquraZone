package interfaceSample;

public class HDFC implements RBI {

	public static void main(String[] args) {
		HDFC obj=new HDFC();
		obj.recurringDeposit(50000,2);

	}

	@Override
	public void recurringDeposit(double amount, int duration) {
		double totalAmount;
		totalAmount=amount+(amount*interestRate*duration)/100;
		System.out.println("Total Amount:"+totalAmount);
		
	}

}
