package handlingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement messageInput=driver.findElement(By.cssSelector("[id='single-input-field']"));
		js.executeScript("arguments[0].value='Hello I am travelling today';", messageInput);
		
		WebElement messageBtn=driver.findElement(By.cssSelector("[id='button-one']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", messageBtn);
		
		
		

	}

}
