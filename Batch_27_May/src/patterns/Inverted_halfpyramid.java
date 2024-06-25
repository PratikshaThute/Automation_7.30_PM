package patterns;

public class Inverted_halfpyramid {

	public static void main(String[] args) {
		
		for(int x = 6; x>=1; x--) {
			for(int y=1 ; y<=x; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
	
		for(int xx = 6; xx>=1; xx--) {
			for(int yy=1 ; yy<=xx; yy++) {
				System.out.print(yy+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
		
		for(int xx1 = 6; xx1>=1; xx1--) {
			for(int yy1=1 ; yy1<=xx1; yy1++) {
				System.out.print(xx1+""+yy1+" ");
			}
			System.out.println();
		}
	}

}
