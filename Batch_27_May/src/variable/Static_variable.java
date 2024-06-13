package variable;

import java.util.jar.Attributes.Name;

public class Static_variable {
	
	static String b = "Manual";
	
	public void name() {
		System.out.println("from name method " + b);
	}
	
	public static void testing() {
		System.out.println("from testing method " + b);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("from main method " + b);
		
		Static_variable abc = new Static_variable();
		abc.name();
		
		testing();
		Static_variable.testing();
	}

}
