package method_arguement;

public class Method_001 {
	
	int d;
	String k;
	
	static float e;
	
	public void placement(int x, String j) {
		d=x;
		k=j;
		System.out.println(d);
		System.out.println(k);
	}
	
	public static void number(float y) {
		e=y;
		System.out.println(e);
	}
	

	public static void main(String[] args) {
		
		Method_001 m1 = new Method_001();
		
		m1.placement(77, "Pratik Lohakare");
		
		System.out.println(m1.d);
		
		//number(99.99f);
		
		Method_001.number(101.89f);
	}

}
