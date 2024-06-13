package variable;

public class Local_variable {
	
	public void testing() {
	    int a = 99;
		System.out.println(a);
	}
	
	public void automation() {
		String b = "API";
		System.out.println(b);
	}
	
	public static void manual() {
		String abc = "SQL";
		System.out.println(abc);
	}

	public static void main(String[] args) {
	
		manual();
		
		Local_variable v = new Local_variable();
		v.automation();
		v.testing();
	}

}
