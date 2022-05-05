package Chandra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Orange_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Eclipse\\\\eclipse-jee-2022-03-R-win32-x86_64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		new Actions(driver).moveToElement(driver.findElement(By.id("menu_leave_viewLeaveModule"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leave List")).click();
		
		boolean selected= driver.findElement(By.id("leaveList_chkSearchFilter_1")).isSelected();
		System.out.println(selected);
		
		boolean sel= driver.findElement(By.id("leaveList_chkSearchFilter_0")).isSelected();
		System.out.println(sel);
		
		//new Select(driver.findElement(By.id("leaveList_cmbSubunit"))).getFirstSelectedOption();
		
		
		
		new Select(driver.findElement(By.id("leaveList_cmbSubunit"))).selectByVisibleText("Sales & Marketing");
		System.out.println("pass");
		Thread.sleep(2000);
		System.out.println(new Select(driver.findElement(By.id("leaveList_cmbSubunit"))).getFirstSelectedOption());
		Thread.sleep(2000);
		driver.findElement(By.name("leaveList[calFromDate]")).clear();
		
		driver.findElement(By.name("leaveList[calFromDate]")).sendKeys("2022-04-16");
		driver.findElement(By.name("leaveList[calToDate]")).clear();
		driver.findElement(By.name("leaveList[calToDate]")).sendKeys("2022-04-16");
		Thread.sleep(4000);
		
		driver.findElement(By.id("leaveList_chkSearchFilter_3")).click();
		//new Actions(driver).doubleClick(driver.findElement(By.xpath("//div[@id=\"wrapper\"]")));
		
		driver.findElement(By.name("leaveList[cmbWithTerminated]")).click();
		Thread.sleep(4000);
		//new Actions(driver).doubleClick(driver.findElement(By.name("leaveList[cmbWithTerminated]")));
		System.out.println("all are passed");
		//Thread.sleep(4000);
		new Actions(driver).contextClick(driver.findElement(By.id("leaveList_cmbSubunit")));
		
		//driver.close();
		
		System.out.println(new Select(driver.findElement(By.id("leaveList_cmbSubunit"))).getFirstSelectedOption());
		
		
		

		
		//driver.close();

	}

}
