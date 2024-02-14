package handlingUIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		
		/**
		 * we can switch into Frame using
		 * 1) Frame WebElement
		 * 2) Using frame id or name
		 * 3) using index of frame
		 */
		WebElement heading = driver.findElement(By.xpath("//h3"));
		System.out.println(heading.getText());
		WebElement frameWebElement = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
    	driver.switchTo().frame(frameWebElement);

    	//we are using frame id here
//	   //driver.switchTo().frame(0);
//	
//		
		WebElement element=driver.findElement(By.xpath("//*[@id='tinymce']"));
		
		element.sendKeys("hello hello");
//		
//		//used to come out of frame
		driver.switchTo().defaultContent();
//		
		System.out.println(heading.getText());
		
	    driver.quit();
	
		
		
		

	}

}
