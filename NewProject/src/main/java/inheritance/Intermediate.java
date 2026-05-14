package inheritance;

public class Intermediate extends SingleParent{


	public void child2()
	{
		System.out.println("This is Child2");
	}
	public static void main(String[] args) {
		Intermediate obj=new Intermediate();
		obj.child2();
		obj.display();
		
		
	}
	

}
