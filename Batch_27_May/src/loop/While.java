package loop;

public class While {

	public static void main(String[] args) {
		//print 30 to 70
		
		int w = 30;
		while(w<=70) {
			//System.out.println(w);
			w++;
		}
		
		//System.out.println("-----------------------------------------------");

		int w_1 = 70;
		while(w_1>=30) {
			//System.out.println(w_1);
			w_1--;
		}
		
		int d = 1;
		while(d<=1000) {
			if(d%2==0) {
				//System.out.println(d);
			}
			d++;
		}
		
		int d1 = 100;
		while(d1>=1) {
			if(d1%2==0) {
				//System.out.println(d1);
			}
			d1--;
		}
		
		int d4 = 1;
		while(d4<=50) {
			if(d4%2!=0) {
				//System.out.println(d4);
			}
			d4++;
		}
		
		int y = 1;
		while(y<=10) {
			//System.out.println("7 * " +y+ " = " + 7*y);
			y++;
		}
		
		int R = 1;
		while(R<=10) {
			System.out.println(9*R);
			R++;
		}
		
	}

}
