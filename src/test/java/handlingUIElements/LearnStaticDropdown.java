package handlingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnStaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		/**
		 * Any dropdown having select and option tag is static/select Dropdown
		 * create object of select class and select any option by using following three methods
		 */
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select staticDropdown = new Select( dropdown);
		Thread.sleep(1000);
		staticDropdown.selectByVisibleText("Option 2");
		Thread.sleep(1000);
		staticDropdown.selectByVisibleText("Option 1");
		Thread.sleep(1000);
		
		//value means value of option
		staticDropdown.selectByValue("2");
		Thread.sleep(1000);
		
		staticDropdown.selectByIndex(1);
		
		

	}

}
