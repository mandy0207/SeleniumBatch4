package handlingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		/**
		 * Valid for Checkbox and radio buttons
		 * isSeelected
		 * isDisplayed
		 * isEnabled
		 */
		WebElement secondCheckbox = driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
		boolean chekckBoxSelected = secondCheckbox.isSelected();
		
		
		System.out.println("IS CHECKBOX SELECTED:"+chekckBoxSelected);
		Thread.sleep(1000);
		secondCheckbox.click();
		
		chekckBoxSelected=secondCheckbox.isSelected();
		System.out.println("IS CHECKBOX SELECTED:"+chekckBoxSelected);
		
		
		WebElement firstCheckbox = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
		
		boolean checkboxDisplayed=firstCheckbox.isDisplayed();
		System.out.println("IS CHECKBOX Displayed:"+checkboxDisplayed);
		
		boolean checkboxEnabled=firstCheckbox.isEnabled();
		
		System.out.println("IS CHECKBOX Enabled:"+checkboxEnabled);
		
		driver.quit();

	}

}
