package abstraction;

public class Contractor extends Employee {

	int workinghour;

	@Override
	public double calculateSalary() {
		return paymentperhour*workinghour;
		
		
	}
	
	
	

}
