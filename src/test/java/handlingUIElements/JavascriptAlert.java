package handlingUIElements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//ul//li[1]/button")).click();
		
		/**
		 * For handling JS Alerts We have to switch to Alert and we can either accept it
		 * or dismiss it We can getText of alert as well
		 */
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);

		alert.accept();

		driver.findElement(By.xpath("//ul/li[2]/button")).click();
	
		alert.dismiss();

		driver.findElement(By.xpath("//ul/li[3]/button")).click();
		
		alert.sendKeys("My name is NISSY");
		alert.accept();
		
		driver.quit();

	}

}
