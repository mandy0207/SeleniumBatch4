package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 
		 /**
		  * CssSelector Syntax
		  * 1) if we have a class ->> .classname
		  * 2) if we have id --> #id
		  * 3) tagname[attribute='value'] or [attribute='value']    --> tagname is optional
		  * 4) if there are multiple classes we can omit space and put dot
		  *   .button-1.login-button
		  */

		 driver.findElement(By.cssSelector(".ico-login")).click();
		 driver.findElement(By.cssSelector("#Email")).sendKeys("obsqura24@gmail.com");
		 
		 driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("mypassword");
		
		 driver.findElement(By.cssSelector(".button-1.login-button")).click();
		 
		 driver.quit();
	}

}
