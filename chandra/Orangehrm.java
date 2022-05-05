package Chandra;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Eclipse\\\\eclipse-jee-2022-03-R-win32-x86_64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(5000);
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.name("Submit")).click();
		
		String style=driver.findElement(By.tagName("span")).getAttribute("style");
		System.out.println("style is"+ style);
		
		
		String color= driver.findElement(By.tagName("span")).getCssValue("color");
		System.out.println("color is"+ color);
		
	    String font = driver.findElement(By.tagName("span")).getCssValue("font");
	    System.out.println("font is"+font);
	 
	    String text = driver.findElement(By.tagName("span")).getText();
	    System.out.println("text is" + text);
		
	    Dimension size=driver.findElement(By.tagName("span")).getSize();
	    System.out.println("size is" + size);
	    
	    System.out.println(size.getHeight());
	   System.out.println(size.getWidth());
	    
	    Point location = driver.findElement(By.tagName("span")).getLocation();
	    System.out.println("location is" + location);
	    System.out.println(location.getX());
	    System.out.println(location.getY());
	    
	   Class<? extends WebElement> Class= driver.findElement(By.id("txtUsername")).getClass();
	   System.out.println("class is" + Class);
	    
	    
	   String attribute= driver.findElement(By.id("txtUsername")).getTagName();
		System.out.println("attribute is "  + attribute);
		
	boolean displayed = driver.findElement(By.id("btnLogin")).isDisplayed();
	System.out.println(displayed);
	boolean enabled = driver.findElement(By.id("btnLogin")).isEnabled();
	System.out.println(enabled);
	
	
	
	driver.close();
		
		
		
		
		

	}

}
