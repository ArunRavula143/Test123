package Chandra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_w3shools {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Eclipse\\\\eclipse-jee-2022-03-R-win32-x86_64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		Thread.sleep(3000);
		//frame handle
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		Thread.sleep(2000);
		//alert handle
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println("pass-alert accepted");
		
		//get title
		
		System.out.println("get title is" +driver.getTitle());
		
		driver.switchTo().defaultContent();
		//driver.findElement(By.id("getwebsitebtn")).click();
		//System.out.println("get title is" +driver.getTitle());
		
		//driver.switchTo().parentFrame();
		System.out.println("pass");
		//page title
		
	    driver.navigate().to("https://fb.com");
		//System.out.println("get title is" +driver.getTitle());
	    Thread.sleep(2000);
		//back
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("get title is" +driver.getTitle());
		//forward
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println("get title is" +driver.getTitle());
		//refresh
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println("get title is" +driver.getTitle());
		
		//driver.quit(); // close all windows
	
	
		
	}

}
