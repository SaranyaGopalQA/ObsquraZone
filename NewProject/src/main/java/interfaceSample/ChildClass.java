package interfaceSample;

public class ChildClass implements Parent{

	public static void main(String[] args) {
		Parent obj=new ChildClass();
		obj.display();
		obj.sum(a, b);
		Parent.diff(a, b);

	}

	@Override
	public void display() {
		System.out.println("This is an Interface");
		
	}

}
