package default_value;

public class Default_value {
	
	byte a;
	short b;
	int c;
	long d;
	
    float e;
    double f;
    
    char g;
    boolean h;
    
    String i;
	

	public static void main(String[] args) {
	
		Default_value d1 = new Default_value();
		Default_value d = new Default_value();
		
		//object
		//    classname referencevariable = new classname();
		
		System.out.println("the default value of byte is : " + d1.a);
		System.out.println("the default value of short is : " +d1.b);
		System.out.println("the default value of int is : " +d1.c);
		System.out.println("the default value of long is : " +d1.d);
		System.out.println("the default value of float is : " +d1.e);
		System.out.println("the default value of double is : " +d1.f);
		
		System.out.println("the default value of char is :" + d1.g);
		System.out.println("the default value of boolean is : " + d1.h);
		
		System.out.println("the default value of string is : " + d1.i);

	}

}
