package decision_making;

public class Nested_if {

	public static void decision() {
		int z = 1000;

		if (z == 1000) {
			System.out.println("z equals to 1000");
			if (z < 200) {
				System.out.println("z is less than 200 ");
				if (z > 300) {
					System.out.println("z is greater than  300 ");
					if (z == 500) {
						System.out.println("z equals to 500");
						if (z < 2000) {
							System.out.println("z is less than 2000");
						}
					}
				}
			}else {
				System.out.println("2nd if is false");
			}
		}else {
			System.out.println("none");
		}
		
		
		
		
		if(z>2000) {
			
		}

	}

	public static void main(String[] args) {
		Nested_if n1 = new Nested_if();
		decision();
	}

}
