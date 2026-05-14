package modifiers;

import accessSpecifier.Modifiers;

public class SampleModifiers extends Modifiers {

	public static void main(String[] args) {
		SampleModifiers obj=new SampleModifiers();
		obj.pubMethod();
		obj.proMethod();
		Modifiers obj1=new Modifiers();
		obj1.pubMethod();
		//obj1.proMethod(); not posible outside the package
	}

}
