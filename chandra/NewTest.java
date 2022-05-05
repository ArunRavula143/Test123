package Chandra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver= new ChromeDriver();
	
  @Test
  public void ts_o1() throws InterruptedException {

	  beforeMethod();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		afterMethod();
		

  }
  @Test
  public void ts_02() throws InterruptedException {

	     beforeMethod();
		driver.findElement(By.id("txtUsername")).sendKeys("gggg");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		afterMethod();
  }
  
  @Test
  public void ts_03() throws InterruptedException {
	    beforeMethod();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("sssss");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		afterMethod();
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Eclipse\\\\eclipse-jee-2022-03-R-win32-x86_64\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	Thread.sleep(2000);
 
  }
  
  @AfterMethod
  
  public void afterMethod() {
	  
	  driver.close();
  }
}
