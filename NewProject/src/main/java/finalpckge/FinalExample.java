package finalpckge;

public class FinalExample {
	
	public final void show()
	{
		System.out.println("This is Final Method");
		
	}
	/*public final void show()
	{
		System.out.println("This is Final Method");
		
	}*/

	public static void main(String[] args) {
		final int num=65;
		//num=89;
	
		FinalExample obj=new FinalExample();
		obj.show();
	}
	
	

}
