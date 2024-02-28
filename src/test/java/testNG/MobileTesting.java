package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MobileTesting {

	
	
	@Test(groups="Regression")
	public void firstMobileTest() {
		System.out.println("I am in first Mobile Test");
	}
	
	@Test
	@Parameters({"UserName","Password"})
	public void secondMobileTest(@Optional String UserName ,@Optional String Password) {
		System.out.println("I am in second Mobile Test");
		System.out.println(UserName + " :"+ Password);
	}
	
	
//	@BeforeTest
//	public void beforeTest() {
//		System.out.println("I am in before Mobile test");
//	}
//	
//	@AfterTest
//	public void afterTest() {
//		System.out.println("I am in after Mobile test");
//	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in before Mobile class");
	}
	

	@AfterClass
	public void afterClass() {
		System.out.println("I am in after Mobile class");
	}
	
}
