package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MobileTesting {


	@Test
	public void firstMobileTest() {
		System.out.println("I am in first Mobile Test");
	}
	
	@Test
	public void secondMobileTest() {
		System.out.println("I am in second Mobile Test");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in before test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am in after test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in before class");
	}
	

	@AfterClass
	public void afterClass() {
		System.out.println("I am in after class");
	}
	

	



	

}
