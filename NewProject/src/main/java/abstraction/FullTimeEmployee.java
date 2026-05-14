package abstraction;

public class FullTimeEmployee extends Employee{

	public static void main(String[] args) {
	Contractor obj=new Contractor();
	obj.paymentperhour=500;
	obj.workinghour=5;
	System.out.println("Salary of Contractor:"+obj.calculateSalary());
	
	FullTimeEmployee obj1=new FullTimeEmployee();
	obj1.paymentperhour=500;
	System.out.println("Salary of Full Time Employee:"+obj1.calculateSalary());

	}

	@Override
	public double calculateSalary() {
		
		return paymentperhour*8;
	}


}
