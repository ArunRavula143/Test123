package arunseleniumproject;

import org.testng.annotations.Test;

public class Testngskip {
  @Test
  public void f1() {
	  System.out.println("f1 method implementation");
	 // int z=5/0;
  }
  @Test
  public void f2() {
	  System.out.println("f2 method implementation");
  }
  @Test //(dependsOnMethods = "f1")
  //@Test(dependsOnMethods = ("f1"), alwaysRun=true)
  public void f3() {
	  System.out.println("f3 method implementation");
  }
  @Test //(dependsOnMethods = "f1")
  public void f4() {
	  System.out.println("f4 method implementation");
  }
  
  @Test
  public void f5() {
	  System.out.println("f5 method implementation");
  }
}
