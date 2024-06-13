package string;

public class String2 {

	public static void main(String[] args) {
		
		// immutable class
		String abc = new String("Manual");
		String abcd = new String("Manual Testing");
		
		System.out.println(abc.concat(" Testing"));
		
		System.out.println(abc);
		
		System.out.println("----------------------------------------------------------");
		
		//mutable class
		StringBuffer xyz = new StringBuffer("Automation");
		System.out.println(xyz.append(" Testing"));
		System.out.println(xyz);
		
		
		
		
		
		
		
	}

}
