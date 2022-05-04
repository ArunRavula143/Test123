package arunseleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTest {

	public static void main(String[] args) throws InterruptedException {
		String per="Performance";
		//String emsg="arun1"; 
		//String amsg="arun1"; 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(4000);
		//driver.findElement(By.id("btnLogin")).click();
		Actions a= new Actions(driver);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Boolean b=driver.findElement(By.id("menu__Performance")).isDisplayed();
		Assert.assertTrue(b);
		System.out.println(b);
		String text=driver.findElement(By.id("menu__Performance")).getText();
		System.out.println(text);
		Assert.assertEquals(per,driver.findElement(By.id("menu__Performance")).getText());
	
		//Assert.assertEquals(mrkt,driver.findElement(By.id("MP_link")).getText());
		
		/*
		 * driver.get("https://opensource-demo.orangehrmlive.com"); Thread.sleep(3000);
		 * boolean b=emsg.equals(amsg); Assert.assertTrue(b);
		 * //Assert.assertEquals(emsg, amsg);
		 */		
		
		Thread.sleep(3000);
		driver.close();
	}

}

