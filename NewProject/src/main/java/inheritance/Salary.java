package inheritance;

public class Salary extends Calculate {
	double salary;
	public void calculateSalary()
	{
		salary=bpay+hra-pf-dedctn+bonus;
	}

}
