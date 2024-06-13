package operators;

public class Comparison_operator {

	public static void main(String[] args) {
		int x = 1000;
		int y = 500;
		
		System.out.println(x>y);
		
		boolean z = x<y;
		System.out.println(z);
		
		System.out.println(x>=1000);
		
		boolean h = y<=500;
		System.out.println("y is less than or equals to 500 : " + h);
		
		System.out.println("y equals to x is : " + (y==x));
	}

}
