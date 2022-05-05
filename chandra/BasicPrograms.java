package Chandra;

public class BasicPrograms {

	public static void main(String[] args) {
		
		BasicPrograms obj =new BasicPrograms();
		
		int q= obj.add(25, 85);
		System.out.println(q);
		
		double t=obj.substraction(78, 52.58);
		System.out.println(t);
			
		}
	public int add( int i, int j)  {
		
		int k= i+j;
		return k;
		
	}
	
	public double substraction(int i, double j) {
		double k= i-j;
		return k;
	}
	
	public int reversenumber(int h) {
		
		return h;
		
		
	}

}
