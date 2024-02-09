package Java;

import java.util.Arrays;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> names= Arrays.asList("Mandy", "Sandy","candy");
		System.out.println(names.size());
		
		for(int i =0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
//		for(String name : names) {
//			System.out.println(name);
//		}
		
	
		
		
		

	}

}
