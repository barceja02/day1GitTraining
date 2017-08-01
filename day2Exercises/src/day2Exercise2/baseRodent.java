package day2Exercise2;


class rodent{
	public String size = "";
	public String color= "";
	protected void sizes() {
		size = "Small";
	}
	
	protected void colors() {
		color= "Any";
	}
	
}
 
 class hamster extends rodent{
	 
	 @Override
	 protected void sizes(){
		 size = "medium hamster";
	 }
	 @Override
	 protected void colors(){
		 color = "brown";
	 }
	 
 }
 
class gerbil extends rodent{
	 
	 @Override
	 protected void sizes(){
		 size = "small gerbil";
	 }
	 @Override
	 protected void colors(){
		 color = "white";
	 }
	 
 }

class mouse extends rodent{
	 
	 @Override
	 protected void sizes(){
		 size = "big mouse";
	 }
	 @Override
	 protected void colors(){
		 color = "black";
	 }
	 
}

 public class baseRodent {
	public static void main(String args[]) {
		gerbil g = new gerbil();
		hamster h = new hamster();
		mouse m = new mouse();
		
		rodent[] rowdent = {g,h,m};
		
		for(rodent r: rowdent) {
			r.sizes();
			r.colors();
			System.out.print("size: "+ r.size);
			System.out.print("color: " + r.color);
			System.out.print("\n");
		}
	}
}


