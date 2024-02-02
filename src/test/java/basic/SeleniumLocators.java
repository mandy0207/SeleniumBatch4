package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		/**
		 * Selenium supports multiple locators
		 * 1) By id
		 * 2) By name
		 * 3) By className
		 * 4) By LinkText
		 * 5) By  PartialLinkText
		 */
		
		//sendkeys is used to send some data into input field
		//One Element can have multiple classes but ID would always be Unique
		
	     driver.findElement(By.id("user-name")).sendKeys("standard_user");
	     driver.findElement(By.name("password")).sendKeys("secret_sauce");
	     driver.findElement(By.className("submit-button")).click();
	     
	    driver.findElement(By.className("bm-burger-button")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("About")).click();
	    
	    driver.navigate().back();
	    driver.findElement(By.className("bm-burger-button")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.partialLinkText("Logo")).click();
	     
	    driver.quit();
	     
	     

	}

}
