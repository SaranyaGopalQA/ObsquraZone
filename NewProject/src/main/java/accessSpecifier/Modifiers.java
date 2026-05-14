package accessSpecifier;

public class Modifiers {

	public void pubMethod()
	{
		System.out.println("This is s Public method");
	}
	
	 void defMethod()
	{
		System.out.println("This is s Default method");
	}
	private void priMethod()
	{
		System.out.println("This is s Private method");
	}
	
	protected void proMethod()
	{
		System.out.println("This is s Protected method");
	}
	public static void main(String[] args) {
		
		Modifiers obj=new Modifiers();
		obj.pubMethod();
		obj.proMethod();
		obj.defMethod();
		obj.priMethod();
	}

}
