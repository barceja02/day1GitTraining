package day2Exercises;

public class callDerivedBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d2Ex2derivedClass derived = new d2Ex2derivedClass();
		d2Ex2baseClass base = (d2Ex2baseClass) derived;
		base.method1();
	}

}
