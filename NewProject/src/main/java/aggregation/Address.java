package aggregation;

public class Address {
	String address;
	Student ref;
	
	public void getAddress(String address,Student ref)
	{
		this.address=address;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println("Name:"+ref.name);
		System.out.println("Roll Number:"+ref.rno);
		System.out.println("Address:"+address);
	}

	public static void main(String[] args) {
		Student obj=new Student();
		Address obj1=new Address();
		
		obj.get("Anu",2);
		obj1.getAddress("Palakkad", obj);
		obj1.display();

	}

}
