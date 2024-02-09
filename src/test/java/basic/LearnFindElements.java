package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
	     driver.findElement(By.name("password")).sendKeys("secret_sauce");
	     driver.findElement(By.className("submit-button")).click();
	     
	     List<WebElement> addToCartBtns = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
	     
	     System.out.println(addToCartBtns.size());
	     
	     for(int i =0;i<addToCartBtns.size();i++) {
	    	 addToCartBtns.get(i).click();
	     }
	     
	     /**
	      * Modern way of using for loop
	      */
//	     for(WebElement element :addToCartBtns) {
//	    	 element.click();
//	     }

	}

}
