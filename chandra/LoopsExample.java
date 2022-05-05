package Chandra;

public class LoopsExample {

	public static void main(String[] args) {
		LoopsExample lo=	new LoopsExample();
		
		lo.switchst();
		lo.ifst();
	}
	
	
	
	  public  void ifst() {
	  
	  int i=10; int j=10; int k=10;
	  
	  if (i>j && i>k) { System.out.println("i is greater number");
	  
	  }
	  
	  else if (j>k && j>i) {
	  
	  System.out.println("j is greater number"); }
	  
	  if (k>i && k>j) {
	  
	  System.out.println("k is greater"); } else {
	  System.out.println("condition not met"); }
	  
	  }
	 
	
	public  void switchst() {
		
		String key= "Nellore";
		
		switch (key) {
		case "Nellore": {
			
			System.out.println("Nellore in AP");
			break;
		}
		case "fgg":{
			System.out.println("fgg in AP");
		}
		
		default:
			//throw new IllegalArgumentException("Unexpected value: " + key);
			System.out.println("district not there in list");
		}
		
		
	
	}
}
