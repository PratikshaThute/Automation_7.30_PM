package return_statement;

public class Return_001 {
	
	public int add(int a, int b, int c) {
		return 5000;
	}
	
	public int add(int a, int b) {
		return b;
	}
	
	public static void main(String[] args) {
		Return_001 cv = new Return_001();
		System.out.println(cv.add(65, 45, 78));
		
		System.out.println("add method with 2 args " + cv.add(65, 45));
	}

}
