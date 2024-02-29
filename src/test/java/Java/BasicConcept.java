package Java;

import org.testng.annotations.Test;

public class BasicConcept {

	int i =1;
	@Test
	public void test1() {
		
		i=i+1;
	    System.out.println(i);
	}
	
	
	@Test
	public void test2() {
		i=i+1;
		System.out.println(i);
	}
}
