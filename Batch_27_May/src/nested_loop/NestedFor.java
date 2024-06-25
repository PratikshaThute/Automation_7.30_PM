package nested_loop;

public class NestedFor {

	public static void main(String[] args) {
		
		for(int a = 1; a<=3; a++) {
			System.out.println("outer loop value : " + a);
			for (int b =1; b<=2; b++) {
				System.out.println("inner loop value : "+ b);
			}
			
		}

	}

}
