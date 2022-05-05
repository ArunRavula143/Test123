package Chandra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		String s= "chnadra";
		
		//Arrays
		String s1[]= {"abc", "xyz","kgh", "mon"};
		int marks[]= {10,11,13,17};
		System.out.println(s1.length);
	    System.out.println(s1.clone());
	    
	    String s3[]= new String[10];
	    System.out.println(s3.length);
	    
	    System.out.println(s.concat(s1[0]));
	    
	    
	    
	    //s1[1]= "siva";
	    
	    System.out.println(s1[1]);
	    
	    s3[4]="hygjggffddf";
	    System.out.println(s3[4]);
	    
	   
 //Array List
	    
	    List<String> list= new ArrayList<String>();
	    list.add("1");
	    list.add("5");
	    list.add("1");
	    list.add("fghfh");
	    list.add("1");
	    list.add("ghfjyu");
	    list.add("1");
	    
	    
	    list.add(5, "1235");
	    list.add(0, "abcg");
	    list.add(null);
	    
	    System.out.println(list);
	    System.out.println(list.size());
	    
	    for (int i = 0; i < list.size(); i++) {
	    	
	    	System.out.println(i);
			
		}
			
		}
	    
	    
	 // ArrayList<String> ku=  new ArrayList<String>();
	    
	    
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	


