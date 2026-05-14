package interfaceSample;

public class MultipleChild implements Parent1,Parent2{

	public static void main(String[] args) {
		MultipleChild obj=new MultipleChild();
		obj.display();
		obj.show();
		obj.get();
	}

	@Override
	public void show() {
		System.out.println("Parent2");
		
	}

	@Override
	public void display() {
		System.out.println("Parent1");
	}

	@Override
	public void get() {
		System.out.println("Parent 1 get Method");
		System.out.println("Parent 2 get Method");
	}

}
