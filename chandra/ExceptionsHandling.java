package Chandra;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionsHandling {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Eclipse\\eclipse-jee-2022-03-R-win32-x86_64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");

		Thread.sleep(2000);
		try {
		driver.findElement(By.xpath("gdhjkd")).sendKeys("dd");
		
		}
		
		/*
		 * catch (NoSuchElementException e) { { System.out.println("element not found");
		 * } }
		 */
		
		  catch (Exception e) {
		  
		  System.out.println("reached"); }
		 finally {
				System.out.println("I am in final block");
			}
		
		driver.close();
		
	}
// Order should be unique to general
	
// 

	
}
