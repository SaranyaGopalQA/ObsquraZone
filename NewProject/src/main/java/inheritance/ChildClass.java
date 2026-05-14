package inheritance;

public class ChildClass extends SingleParent {

	
		public void show()
		{
			System.out.println("This is the Chlid class");
		}
		public static void main(String[] args) {
			ChildClass obj=new ChildClass();
			obj.show();
			obj.display();
	}

}
