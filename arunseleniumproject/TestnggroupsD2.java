package arunseleniumproject;

import org.testng.annotations.Test;

public class TestnggroupsD2 {
	 @Test(groups = "sanity")
	  public void btest1() {
		  //int z=4/0;
		  System.out.println("bTest1 implementation");
		 // int z=4/0;
	  }
	  @Test(groups="regression")
	  public void bdemoTest() {
		  System.out.println("bdemoTest");
		  
	  }
	@Test(groups = "sanity")
	  public void btest2() {
		System.out.println("btest2 implementation");
		}
}
