package handlingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/disappearing_elements");
		
		/**
		 * 
		 */
		Actions act = new Actions(driver);
		WebElement homeTab=driver.findElement(By.xpath("//ul/li[1]"));
		WebElement aboutTab=driver.findElement(By.xpath("//ul/li[2]"));
		
		//Hover over an element
		act.moveToElement(homeTab).build().perform();
		Thread.sleep(2000);
		act.moveToElement(aboutTab).build().perform();
		
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		
		WebElement userName = driver.findElement(By.id("username"));
		//click and send keys using keyboard/mouse actions
		act.moveToElement(userName).click().sendKeys("nissy").build().perform();
		Thread.sleep(1000);
		userName.clear();
		//key sequence for keyboard actions
		act.moveToElement(userName).click().keyDown(Keys.SHIFT).sendKeys("nissy").build().perform();
		
		WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		//double click action using mouse
		act.moveToElement(submitBtn).doubleClick().build().perform();
		Thread.sleep(2000);
		
		//Context click is used for right clicking on any element
		act.moveToElement(submitBtn).contextClick().build().perform();
		
		driver.quit();
		
		
		
		
		

	}

}
