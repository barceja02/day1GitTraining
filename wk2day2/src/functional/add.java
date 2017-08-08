package functional;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(divideZero(6,0));
		System.out.println(addRecurssion(20,100000000));
	}
	
	public static int add(int a, int b) {
		while (b-- >0 )
			a++; 
		return a;
		
	}
	
	public static int divideZero(int a, float b) {
		return (int) (a/ (float) b);
	}
	
	public static int addRecurssion(int a, int b) {
		return b == 0 ? a : add(a, b);
	}

}
