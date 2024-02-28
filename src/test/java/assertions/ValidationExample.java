package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationExample {

	@Test
	public void seleniumValidation() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, "Demo Web Shop");

		boolean isEnabled = driver.findElement(By.cssSelector("[value='Subscribe']")).isEnabled();
		if (isEnabled)
			System.out.println(" pASSED");

		else
			System.out.println("failed");

		System.out.println(isEnabled);
		Assert.assertTrue(isEnabled);
		driver.quit();
	}
}
