package Exercise5;

class dog{
	public void bark(int a) {
		System.out.println("\nArf!");
	}
	
	public void bark(String a) {
		System.out.println("\nWoof!");
	}
	
	public void bark(double a) {
		System.out.println("\nWarf!");
	}
	
	public void bark(boolean a) {
		System.out.println("\nGRRR!");
	}
	
}

public class doggo {
	public static void main(String args[]) {
		dog d = new dog();
		d.bark(1);
		d.bark(1.5);
		d.bark("a");
		d.bark(true);
	}
}
