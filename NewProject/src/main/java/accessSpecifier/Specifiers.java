package accessSpecifier;

public class Specifiers extends Modifiers {

	public static void main(String[] args) {
		Specifiers obj=new Specifiers();
		obj.pubMethod();
		obj.proMethod();
		obj.defMethod();
		//obj.priMethod(); Nt visible outside the class
	}

}
