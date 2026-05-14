package inheritance;

public class Teacher extends Person {
	public void displayTeacher()
	{
		String subject="Maths";
		System.out.println(subject);
	}
	public static void main(String args[])
	{
		Teacher t=new Teacher();
		t.displayPerson();
		t.displayTeacher();
	}

}
