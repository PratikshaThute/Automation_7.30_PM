package decision_making;

public class If_Statement {

	public static void main(String[] args) {

		int a = 80;
		int b = 300;
		
		if (a == b) {
			System.out.println("a equals to b");
		}
		
		if (a < 100) {
			System.out.println("a is less than 100");
		}

		if (!(a > 100)) {
			System.out.println("a is greater than 100");
		}

		if (a == 80 && a < 200) {
			System.out.println("both statement are true");
		}

	}
}
