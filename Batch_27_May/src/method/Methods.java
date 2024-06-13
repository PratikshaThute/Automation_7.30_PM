package method;

public class Methods {
	
	public static void login() {
		
		System.out.println("login method");
		
		String username = "STP INFOTECH";
		System.out.println(username);
		
		String password="STP@12345";
		System.out.println(password);
	}
	
	public static void Multiple() {
		System.out.println("multiple method from methods class");
	}
	
	public static void main(String[] args) {
		
		login();
		
		System.out.println("----------------------------------------------------------------");
		
		//Methods.login();
		
		Multiple();
		
	}

}
