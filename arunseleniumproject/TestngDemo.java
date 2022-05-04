package arunseleniumproject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDemo {
  @Test
  public void test1() {
	  //int z=4/0;
	  System.out.println("Test1 ");
	 // int z=4/0;
  }
  @Test
  public void demoTest() {
	  System.out.println("demoTest");
	  
  }
@Test(dependsOnMethods = "test1")
  public void test2() {
	System.out.println("test2");
	}
@BeforeMethod
public void abc()
{
	System.out.println("Before method");
}
@AfterMethod
public void def()
{
	System.out.println("After method");
}

}
