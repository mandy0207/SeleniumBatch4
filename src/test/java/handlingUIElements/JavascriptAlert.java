package handlingUIElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//ul//li[1]/button")).click();
		Thread.sleep(2000);
		/**
		 * For handling JS Alerts We have to switch to Alert and we can either accept it
		 * or dismiss it We can getText of alert as well
		 */
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);

		alert.accept();

		driver.findElement(By.xpath("//ul/li[2]/button")).click();
		Thread.sleep(1000);
		alert.dismiss();

		driver.findElement(By.xpath("//ul/li[3]/button")).click();
		Thread.sleep(1000);
		alert.sendKeys("My name is NISSY");
		alert.accept();
		
		driver.quit();

	}

}
