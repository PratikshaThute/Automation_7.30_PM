package patterns;

public class Solid_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// *	*	*	*	*
		// *	*	*	*	*
		// *	*	*	*	*
		// *	*	*	*	*
		
		// row = 4, col = 5
			
		for(int r = 1; r<=4; r++) {
			for(int c = 1; c<=5; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
