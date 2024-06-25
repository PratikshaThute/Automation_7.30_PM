package decision_making;

public class Switch_Statement {

	public static void main(String[] args) {
		
		int q = 100;
		
		switch (q) {
		
		case 10:
			System.out.println("value - 10");
			break;
		
		case 20: 
			System.out.println("value - 20");
			break;
			
		case 30: 
			System.out.println("value - 30");
			break;
			
		case 100: 
			System.out.println("value - 100");
			break;
			
		case 40: 
			System.out.println("value - 40");
		break;
			
		case 50: 
			System.out.println("value - 50");
		break;
			
		default :
				System.out.println("wrong case");
	}
		System.out.println("the switch value is : " + q);

}
}
