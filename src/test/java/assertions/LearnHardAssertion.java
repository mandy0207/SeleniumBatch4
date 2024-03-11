package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnHardAssertion {

	
	@Test
	public void HardAssertTest() {
		
		String actualName = "Nissy";
		String expectedName = "Nissy";
		/**
		 * Hard Assertions -> fails the program when anything fails and it will not move forward means
		 * lines of code will not be executed after failure
		 * 
		 * AsserTrue will always expects true
		 * AssertFalse will always expect false
		 */

		
		Assert.assertEquals(actualName, expectedName);
		
		System.out.println("I am before failure");
		Assert.assertTrue(true);
		System.out.println("I am after failure");
		Assert.assertFalse(false);
		
		
		
	}
}
