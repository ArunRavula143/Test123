package Chandra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_gc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Eclipse\\eclipse-jee-2022-03-R-win32-x86_64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ice-uat.guidingcare.com/R1/Portal/");
		driver.findElement(By.id("UserName")).clear();
		driver.findElement(By.id("UserName")).sendKeys("ahs_cbyreddy");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("Sekhar@143143");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(6000);
		
		
		driver.findElement(By.className("k-dropdown-wrap")).click();
		Thread.sleep(2000);
		System.out.println("success");
		//String text = driver.findElement(By.tagName("li")).getText();
	   // System.out.println("text is" + text);
	   // System.out.println("success1");
	    
		WebElement element= driver.findElement(By.className("k-item"));
	    new Select(element).selectByVisibleText("ALTRUISTA ID");
		Thread.sleep(2000);
		
		
		//driver.findElement(By.id("txtSearch")).sendKeys("test");
		
		driver.close();
		//System.out.println("success");
	}

}
