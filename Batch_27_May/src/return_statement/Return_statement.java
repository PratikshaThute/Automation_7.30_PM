package return_statement;

public class Return_statement {
	
	//no argument, no return statement
	public void function1() {
		System.out.println();
	}
	
	//argument, no return statement
	public void function2(int x) {
		System.out.println(x);
	}
	
	//argument, return keyword
	public void function3(int x) {
		return;
		
	}
	
	//argument, return statement
	public double function4(float x) {
		return 67.78;
	}
	
	public void addition() {
		System.out.println("addition method with no argument");
	}
	
	public void addition(int g) {
		System.out.println("addition method with one argument");
	}
	
	public int addition(int a, int b) {
		return 400+200;
	}
	
	public String name(String h) {
		return "batch27may";
	}
	

	
	public static void main(String[] args) {
		Return_statement rs1 = new Return_statement() ;
		
		//System.out.println(rs1.function4(91.78f));
		
		System.out.println("output of addition method : " + rs1.addition(100, 400));
		
		//System.out.println(rs1.name("Return statement"));
		rs1.addition();
		rs1.addition(80);
	}

}
