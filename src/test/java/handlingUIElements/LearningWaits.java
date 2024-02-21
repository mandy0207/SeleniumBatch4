package handlingUIElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningWaits {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));  
		
		driver.findElement(By.cssSelector("[id='save']")).click();
		   
		String name=driver.findElement(By.cssSelector(".card-title")).getText();
		
		System.out.println(name);
		
		/**
		 * 1) implicit wait is a global wait which is applicable across whole project
		 * 2) if any web element is taking more time then implicit wait to load, it will fail
		 * 3) 
		 */
		
		driver.findElement(By.id("progress-bars")).click();
		driver.findElement(By.cssSelector("#downloadButton")).click();
		
		/**
		 *1. Explicit wait is applicable to single or explicit element
		 *2. if any of the web element is taking more time to show up on DOM, create explicit wait
		 * 
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement progressBar=driver.findElement(By.cssSelector("[class='progress-label']"));
		System.out.println(progressBar.getText());
		wait.until(ExpectedConditions.textToBePresentInElement(progressBar, "Complete!"));
		System.out.println(progressBar.getText());
		driver.findElement(By.cssSelector(".ui-dialog-buttonset button")).click();
		
		driver.quit();
		
		
		
		
		
		

	}

}
