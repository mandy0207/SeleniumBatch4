import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReports {

	ExtentReports extent;
	@BeforeTest
    public void generateReports() {
		 String reportPath= System.getProperty("user.dir")+"//Reports//index.html";
		 ExtentSparkReporter reporter = new  ExtentSparkReporter(reportPath);
		 reporter.config().setReportName("Obsqura Automation Report");
		 reporter.config().setDocumentTitle("Company Name");
		 
		 extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("QA Name", "Remya");
		 extent.setSystemInfo("Environment", "QA");
    }
	
	@Test
	public void myFirsttest() {
		
		 extent.createTest("myFirstTest");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.quit();
		 extent.flush();
		 
	}
	
	@Test
	public void mysecondTest() {
		
	   
		extent.createTest("mysecondTest");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 driver.quit();
		 extent.flush();
		 
	}
	@Test
	public void thirdTest() {
		ExtentTest test = extent.createTest("mythirdTest");
		test.fail("deliberately failing it");
		extent.flush();
		Assert.fail();
	}
	

	
	
	
}
