package operators;

public class Logical_Operator {

	public static void main(String[] args) {

		int p = 500;
		int q = 800;

		boolean r = p > q && p == q;
		System.out.println(" F && F :" + r);

		boolean w = p < q && p == q;
		System.out.println("T && F :" +w);
		
		boolean y = p==q && p<q;
		System.out.println("F && T :" +y);
		
		//boolean z = p<q && q>p;
		//System.out.println("T && T :" +z);
		
		
		System.out.println(p<q && q>p);
		
		System.out.println(p==400 && p==500);
	}

}
