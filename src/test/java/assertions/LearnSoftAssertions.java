package assertions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnSoftAssertions {

	
	@Test
	public void softAssertTest() {
		/**
		 * Soft Assert fails the test at last 
		 * It will not abruptly stop the test execution
		 * For throwing assertion failure , we have to assertAll method
		 */
		SoftAssert softAssert= new SoftAssert();
		
		String actualName = "Nissy";
		String expectedName = "aishwarya";
	  
		softAssert.assertEquals(actualName, expectedName);
		
		softAssert.assertTrue(false);
		System.out.println("I am still executing");
		softAssert.assertAll();
	}
}
