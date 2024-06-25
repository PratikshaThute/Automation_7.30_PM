package patterns;

public class Half_pyramid {

	public static void main(String[] args) {
	//row- 4, col - 4
	
		for(int a =1; a<=5; a++) {
			for(int b = 1; b<=a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	System.out.println("------------------------------------------");
		
		for(int aa =1; aa<=5; aa++) {
			for(int bb = 1; bb<=aa; bb++) {
				System.out.print(aa+""+bb+" ");
			}
			System.out.println();
		}
		
	System.out.println("------------------------------------------");
		
		for(int aa1 =1; aa1<=5; aa1++) {
			for(int bb1 = 1; bb1<=aa1; bb1++) {
				System.out.print(bb1+" ");
			}
			System.out.println();
		}
		
	}

}
