package Chandra;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Eclipse\\eclipse-jee-2022-03-R-win32-x86_64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_multiwindows");

		Thread.sleep(2000);
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		driver.switchTo().frame("iframeResult");
		System.out.println("in frame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Open Windows']")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		Thread.sleep(3000);
		//driver.quit();
		
		for (String targetwindow : allwindows) {
			
			System.out.println("entered into window"     +   targetwindow);
			
			/*
			 * if(driver.getCurrentUrl().equals("https://www.microsoft.com/en-in/")) {
			 * break; }
			 */
			driver.switchTo().window(targetwindow);
			
			if(driver.findElements(By.linkText("Microsoft 365")).size()>0){
				
				break;
				
			}
				
		}
			
		driver.findElement(By.linkText("Microsoft 365")).click();
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(parentwindow);
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		System.out.println("in frame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Open Windows']")).click();
		
		}


}
