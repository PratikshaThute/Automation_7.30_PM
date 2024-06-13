package variable;

public class Instance_Variables {
	
	String a = "Automation";
	
	public void verify() {
		System.out.println("from verify method " + a);
	}
	
	public static void function() {
		Instance_Variables v = new Instance_Variables();
		System.out.println("from function method " + v.a);
	}

	public static void main(String[] args) {
		Instance_Variables v = new Instance_Variables();
		System.out.println("from main method " + v.a);
		
		v.verify();
		
		function();
		
	}

}
