package Exercise4;

import java.util.Scanner;

import com.sun.javafx.scene.layout.region.Margins.Converter;

public class Fibonacci {
	public static int ctr=0;
	public static String choice ="";
	public static void main(String args[]) {
		System.out.println("Kindly choose # of series to be displayed:"
				+ "\n[1] Max value of fibonacci should be 100"
				+ "\n[2] Max series of fibonacci should be 100");
		try {
			Scanner scanner = new Scanner(System.in);
			 choice = scanner.nextLine().toString();	
		}catch(Exception e) {
			System.out.print("Sorry, please choose from 1-2 only." + e);
			
		}
		increaseFib(0,1);
		
	}
	public static void increaseFib(int a, int b) {
		int res = 0, temp=0;
		res= a + b;
		a = b;
		b = res;
		res = a;
		ctr++;
		if (Integer.parseInt(choice) == 1) {
			if (a <= 100) {
				System.out.print(a + ", ");
				increaseFib(a,b);
			}
		}else if (Integer.parseInt(choice) == 2) {
			if(ctr <= 100) {
				System.out.print(a + ", ");
				increaseFib(a,b);
			}
		}else {
			System.out.print("Sorry, please choose from 1-2 only.");
		}
		
	}
	
}

