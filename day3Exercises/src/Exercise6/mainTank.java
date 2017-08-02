package Exercise6;


class tanking{
	boolean isfill= false; 	
	public void full(){	
		isfill = true; 
	} 	
	public void empty(){ 	
		isfill= false; 
	}
	@Override
	protected void finalize() {	
		if(!isfill) { 
			System.out.println("tank is empty: disposed");
		}
	}
}

public class mainTank { 		
	public static void main(String[] args){ 	
		tanking bigtank = new tanking(); 
		bigtank.full();  
		System.out.println("fill/full tank: " + bigtank.isfill);
		System.gc(); 
		tanking anotherTank = new tanking();
		anotherTank.empty(); 
		System.out.println("fill/full tank: " + anotherTank.isfill); 
		anotherTank = null;
		System.gc(); 
	} 			
}