package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTesting {

	/**
	 * **** TestNG Annotations are also called Hooks ***
	 * 1) Any method annotated with @Test is considered as test case only
	 * 2) Order of execution of test cases depends upon alphabetical order of test case
	 * 3) Lower the priority of test case it will be execute first
	 *   eg priority =0,1,2 will execute in order.t
	 * 4) If any of test case is not having priority then execution order would be determined by alphabetical order.
	 * 5) Before test will execute once before all the test cases present inside class
	 * 6) After test will execute once after all the test cases present inside class
	 * 7) Before method will execute before every test case or method.
	 * 8) After method will execute after every test case or method
	 */
	
	@Test
	public void firstWebTest() {
		System.out.println("I am in first web test");
	}
	
	@Test(priority=0)
	public void secondWebTest() {
		System.out.println("I am in second web test");
	}
	
	@Test(priority=1)
	public void lasttest() {
		System.out.println("I am in last web Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in after method");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in before test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am in after test");
	}
	
	
	
	
	
	
}
