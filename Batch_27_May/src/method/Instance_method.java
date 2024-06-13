package method;

public class Instance_method {
	
	public void bank() {
		
		String name = "BOI";
		System.out.println(name);
		
		int accno = 1234567898;
		System.out.println(accno);
	}
	
	public void application() {
		System.out.println("Finnone");
	}
	
	public static void testing() {
		System.out.println("automation testing");
	}
	
	public static void main(String[] args) {
		
		Instance_method Im = new Instance_method();
		Im.bank();
		Im.application();
		
		testing();
		//Instance_method.testing();

	}

}
