package methodsinjava;

public class Static_And_NonStatic_Methods {
	
	// Static method
	
	public static void a1() {
		int a = 20; int b = 40;
		int c = a*b;
		System.out.println(c);
		
	}
	// Non static method
	
	public void a2() {
		int a= 30; int d= 10;
		int f= a/d;
		System.out.println(f);
		
	} 

	public static void main(String[] args) {
		
		// to call static method
		
		a1();
		
	// to call non static method
		
		Static_And_NonStatic_Methods obj = new Static_And_NonStatic_Methods();
		
		obj.a2();
		
		
		
	}

}
