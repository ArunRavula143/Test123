package Chandra;

public class Java_Variables {

	public static void main(String[] args) {
	
		int i=102225889;
		System.out.println("i is"  +i);
		
		boolean b= true;
		boolean b1= false;
		System.out.println(" b1 is"+  b1);
		
		
		char c='d';
		System.out.println(c);
		byte by=2;
		short s=142;
		long l= 155884;
		System.out.println(l);
		float f=123;
		System.out.println("fis"+ f);
		
		float f1= 187.567f;
		System.out.println("f1is"+ f1);
		
		double d=123.45677;
		System.out.println("dis"+ d);

		String s1="chandra";
		String s2= "sekhar";
		
		s1.charAt(4);
		System.out.println(s1.charAt(4));
		
		s1.equalsIgnoreCase(s2);
		System.out.println(s1.equalsIgnoreCase(s2));
		
		s1.equals(s2);
		System.out.println(s1.equals(s2));
		
		//s1.concat(s2);
		
		String concat= s1.concat(s2);
		System.out.println(concat);
		
		System.out.println(s1.concat(s2));
		
		
		System.out.println(s1.contains("ra"));
		
		System.out.println(s1.endsWith("z"));
		
		System.out.println(s1.indexOf("a"));
		
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(5, 6));
		
		s1.split(concat);
		
		System.out.println(s1.split("ha"));
		

		
		System.out.println(s1.trim());
		
		
	}

}
