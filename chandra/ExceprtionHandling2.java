package Chandra;

public class ExceprtionHandling2 {

	public static void main(String[] args)  {
		
		ExceprtionHandling2 obj= new ExceprtionHandling2();
		int k;
		//k= obj.div(100, 0);
		
		  try {
			 k= obj.div(100, 0); 
		  System.out.println(k);
		  
		  
		  } 
		  catch (ArithmeticException e) {
 
		 // System.out.println("invalid numbers");
			
		  throw new ArithmeticException("Custom-Exception-----------invalid numbers");
		  }
		 
	}
		public int div(int x, int y)  {
			//Thread.sleep(4000);
			int z;
			z= x/y;
			return z;
			
			/*
			 * try { z= x/y;
			 * 
			 * } catch (Exception e) {
			 * 
			 * System.out.println("/ by zero exception"); return 0; }
			 * 
			 * 
			 * return z;
			 */
			
			
		
		

	}

}
