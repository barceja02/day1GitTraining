package Exercise1and2;


class Unicycle extends CycleClass {
	public String balance() {
		// TODO Auto-generated method stub
		return "Unicycle is very hard to balance";
	}
}

class Bicycle extends CycleClass{
	
	public String balance() {
		// TODO Auto-generated method stub
		return "Bicycle is easy to balance\n";
	}
	
	
}

class Tricycle extends CycleClass{


}

public class CycleClass {
	
	public String ride() {
		return "This is base ride\n";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercise1
		System.out.print("Exercise1\n");
		Tricycle tri = new Tricycle();
		CycleClass base = (CycleClass) tri;
		System.out.print("call tricycle ride: " + base.ride());
		
		Bicycle bi = new Bicycle();
		base = (CycleClass) bi;
		System.out.print("call Bicycle ride: " + base.ride());
		
		Unicycle uni = new Unicycle();
		base = (CycleClass) uni;
		System.out.print("call Unicycle ride: " + base.ride());

//		//Exercise2
//		try {
//			//upCasting
//			CycleClass[] exercise2Cycle =   {(CycleClass) uni, (CycleClass)bi, (CycleClass)tri};
//			for (CycleClass cycleclass: exercise2Cycle) {
//				System.out.print(cycleclass.balance() + "\n");
//			}
//			//downCasting
//			bi = (Bicycle) base;
//			System.out.println(bi.balance());
//			
//			tri = (Tricycle) base;
//			System.out.println(tri.balance());
//			
//			uni = (Unicycle) base;
//			System.out.println(uni.balance());
//		}catch(Exception e) {
//			System.out.println(e);
//		}
	}

}
