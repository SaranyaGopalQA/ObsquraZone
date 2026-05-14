package aggregation;

public class Child {
	
	String address;
	int pin;
	Parent ref;
	
	public Child(String address,int pin,Parent ref)
	{
		this.address=address;
		this.pin=pin;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println("Address:"+address);
		System.out.println("Pin:"+pin);
		System.out.println("Name:"+ref.name);
		System.out.println("Age:"+ref.age);
	}

	public static void main(String[] args) {
		
		Parent obj1=new Parent("Anu",24);
		Child obj=new Child("Palakkad",679523,obj1);
		obj.display();
		
	}

}
