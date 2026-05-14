package inheritance;

public class MultiLevel extends Intermediate {

	
	
		public void child1()
		{
			System.out.println("This is Child1");
		}
		
		public static void main(String[] args) {
			MultiLevel obj=new MultiLevel();
			obj.child1();
			obj.child2();
			obj.display();
			
			
		}
	

}
