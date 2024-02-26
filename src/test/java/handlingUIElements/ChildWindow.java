package handlingUIElements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		/**
		 * In order to handle a child window
		 * we have to switch child window first
		 * 
		 * 1) we can grab set of all window handles and can switch to desired window handle
		 */
		String headingText = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(headingText);
		System.out.println("Title: "+driver.getTitle());
		driver.findElement(By.xpath("//*[@class='example']/a")).click();
		
		//grabbing set of window handles
	        Set<String> windowHandles = driver.getWindowHandles();
		//Grabbing parent window handle and child window handle
		Iterator<String> it = windowHandles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		//switching to child window
		driver.switchTo().window(childWindow);
		
		
		String headingText2 = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(headingText2);
		System.out.println("Title: "+driver.getTitle());
		Thread.sleep(1000);
		driver.close();
		
		//switching to parent window
		driver.switchTo().window(parentWindow);
		System.out.println("Title: "+driver.getTitle());
		driver.close();
		
	}

}
