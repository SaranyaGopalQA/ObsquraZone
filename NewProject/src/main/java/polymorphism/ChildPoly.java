package polymorphism;

public class ChildPoly extends ParentPoly {
	
	public int sum(int num1,int num2)
	{
		System.out.println(super.sum(28,63));
		int diff=num1-num2;
		return diff;
		
	}
	
	public void show()
	{
		super.show();
		System.out.println("Child");
	}

	@Override
	public int mul(int num1, int num2) {
		
		System.out.println( super.mul(45,68));
		int mul=num1*num2;
		return mul;
		
	}

	public static void main(String[] args) {
		ChildPoly obj=new ChildPoly();
		System.out.println(obj.sum(25,24));
		obj.show();
		System.out.println(obj.mul(12,56));

	}

}
