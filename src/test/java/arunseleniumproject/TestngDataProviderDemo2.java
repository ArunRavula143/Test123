package arunseleniumproject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class TestngDataProviderDemo2 {
  @Test(dataProvider = "dp")
 
  public void f(String username, String password ) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(1000);
	
		driver.findElement(By.id("txtUsername")).sendKeys();
		driver.findElement(By.id("txtPassword")).sendKeys();
		Thread.sleep(1000);
		driver.findElement(By.name("Submit")).click();
		boolean b=driver.findElement(By.id("spanMessage")).isDisplayed();
	Assert.assertTrue(b);
	
		Thread.sleep(1000);
		driver.quit();
  }

  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Admin", "admin123"},
      new Object[] {"Admin", "admin"},
      new Object[] {"andn","admin123"},
      new Object[] {"hfdsjf","fjsh"},
      
    };
  }
}
