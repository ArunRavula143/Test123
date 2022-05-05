package arunseleniumproject;

import org.testng.annotations.Test;

public class TestnggroupsD1 {
	 @Test
	  public void atest1() {
		  //int z=4/0;
		  System.out.println("aTest1 implementation");
		 // int z=4/0;
	  }
	  @Test(groups = "sanity")
	  public void ademoTest() {
		  System.out.println("ademoTest implementation");
		  
	  }
	@Test(groups = "sanity")
	  public void atest2() {
		System.out.println("atest2 implementation");
		}
}
