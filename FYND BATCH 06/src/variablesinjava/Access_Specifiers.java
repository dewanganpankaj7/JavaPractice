package variablesinjava;

public class Access_Specifiers {
	
	
	// creating varibles in all specifires
	
	public static int a= 20; // Call in any class and any package
	
	private static int b= 30; // only call in same class
	
	static int c= 40; // call in same package
	
	protected static int d= 50;// call in same package

	
	public static void main(String[] args) {
		
		System.out.println(a+b+c+d);
		
		
		
		
		
		
		
		
	}
}
