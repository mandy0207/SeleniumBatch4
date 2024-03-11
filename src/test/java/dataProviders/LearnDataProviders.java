package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProviders {

	
	
	@Test(dataProvider= "getData")
	public void myfirstTest(String firstName ,String lastName) {
		System.out.println(firstName + " :"+ lastName);
	}
	
	
	@DataProvider
	public String[][] getData() {	
		
	String data[] [] = new String[3][2];
		//data of ist row
		data[0][0]= "Nisyy";
		data[0][1]= "user";
		
		//data of 2nd row
		data[1][0]= "Remya";
		data[1][1]= "Parippayi";
		
		//data of 2nd row
		data[2][0]= "Maninder";
		data[2][1]= "Singh";
		return data;
		
	}
}
