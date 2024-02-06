package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 /**
		  * Xpath syntax
		  * 1)//tagname[@attribute='value']
		  * 2)//parent[index]    eg :
		  * 3) parent/child/child[index]   (//ul[@class='list'])[1]/li[4]/a
		  * 4) using text  //tagname[contains(text(),'sometext')]
		  */
		 
		 driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("obsqura24@gmail.com");
		 driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("mypassword");
		 
		 driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		 driver.findElement(By.xpath("(//ul[@class='list'])[1]/li[4]/a")).click();
		 
		 driver.findElement(By.xpath("(//h2[@class='product-title'])[3]")).click();
		 
		 WebElement qtyBox= driver.findElement(By.xpath("//input[@data-val-number='The field Qty must be a number.']"));
		 qtyBox.clear();
		 qtyBox.sendKeys("4");
		 driver.quit();
		
		 
		 
		 
		 
		 
		 

	}

}
