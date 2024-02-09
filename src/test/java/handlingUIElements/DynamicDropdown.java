package handlingUIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//*[@placeholder='Type to Select Countries']")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> countries = driver.findElements(By.xpath("//*[@class='ui-menu-item']/div"));
		
		for(int i =0;i<countries.size();i++) {
			String country=countries.get(i).getText();
			if(country.equalsIgnoreCase("India")) {
				countries.get(i).click();
				break;
			}
		}
		
//		for(WebElement country : countries) {
//			if(country.getText().equalsIgnoreCase("India")) {
//				country.click();
//				break;
//			}
//		}
		
		driver.quit();

	}

}
