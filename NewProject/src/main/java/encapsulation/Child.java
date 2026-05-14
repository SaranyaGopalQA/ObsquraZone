package encapsulation;

public class Child {

	public static void main(String[] args) {
		
		Parent obj=new Parent();
		obj.setName("Saranya");
		obj.setAge(25);
		obj.setAddress("abcdgjkk");
		obj.setPin(2568);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getAddress());
		System.out.println(obj.getPin());
	}

}
