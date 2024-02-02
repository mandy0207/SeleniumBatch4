package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands {
/**
 * shortcut for imports
 * ctrl+shift+o
 * @param args
 */
	public static void main(String[] args) {
	
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();

	 // To open any page in browser
	 driver.get("https://www.flipkart.com/");
	 
	String title= driver.getTitle();
	System.out.println(title);
	
	// To Grab a current URL
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	//to fresh a page
	driver.navigate().refresh();
	
	driver.navigate().back();
	driver.navigate().forward();

	//close will close the current window or tab only
   // driver.close();
    
	//quit will close entire browser.
	driver.quit();
	 
	}

}
