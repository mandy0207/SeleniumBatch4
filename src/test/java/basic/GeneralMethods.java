package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yatra.com");

		// getText method is used to get text of any WebElement
		String headingText = driver.findElement(By.xpath("//h1[@class='main-heading']")).getText();
		System.out.println(headingText);

		WebElement paragraph = driver.findElement(By.xpath("//h1[@class='paragraphHeading']"));
		System.out.println(paragraph.getText());

		//grab any attribute value of any webelement
		WebElement element = driver.findElement(By.xpath("//ul[@class='selc-flight-options']/li[2]/a"));
		String titleAttr = element.getAttribute("title");
		System.out.println(titleAttr);

		
		//grab css property of any element
		WebElement heading=driver.findElement(By.xpath("//h1[@class='main-heading']"));
		String cssValueofFont=heading.getCssValue("font-weight");
		System.out.println(cssValueofFont);
		System.out.println(heading.getCssValue("padding"));
		
		//ToolTip is nothing but a value of title attribute
		String toolTip=driver.findElement(By.xpath("//*[@id='booking_engine_hotels']")).getAttribute("title");
		System.out.println(toolTip);
		
		
		
		
		driver.quit();
	}

}
