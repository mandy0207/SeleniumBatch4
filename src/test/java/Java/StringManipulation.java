package Java;

public class StringManipulation {

	public static void main(String[] args) {
		String weird= "Alert! Expense Category Created Successfully";
//		String[] aftersplit = weird.split("!");
//		String Desired= aftersplit[1];
//		System.out.println(Desired.trim());
		
		System.out.println(weird.split("!")[1].trim());
		
		
		String name = "     nisssyyyyyy      ";
		System.out.println(name);
		System.out.println(name.trim());

	}

}
