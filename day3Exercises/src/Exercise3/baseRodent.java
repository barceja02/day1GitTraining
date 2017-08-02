package Exercise3;


class rodent{
	public String size = "";
	public String color= "";
	public String name = "";
	protected void sizes() {
		size = "Small";
	}
	
	protected void colors() {
		color= "Any";
	}
	
	protected void name() {
		name= "base rodent";
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
	 @Override
	 protected void name(){
		 name = "hamster";
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
	 @Override
	 protected void name(){
		 name = "Gerbil";
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
	 @Override
	 protected void name(){
		 name = "Mouse";
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
			r.name();
			System.out.print("name: "+ r.name);
			System.out.print("\nsize: "+ r.size);
			System.out.print("\ncolor: " + r.color);
			System.out.print("\n\n");
		}
	}
}


