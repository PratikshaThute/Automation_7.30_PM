package patterns;

public class Hollow_rectangle {

	public static void main(String[] args) {
		//row=4, col= 5
		
		for(int p = 1; p<=4; p++) {
			for(int q =1; q<=5; q++) {
				if(p==1 || p==4 || q==1 || q==5) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}	
			}
			System.out.println();
		}

	}

}
