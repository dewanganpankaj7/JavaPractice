package methodsinjava;

public class Methods_With_Arguments {
	
	public static void a1(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	public void a2(int a, double b) {
		System.out.println(a*b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a1(23, 045);
		a1(21, 320);
		
		Methods_With_Arguments object = new Methods_With_Arguments();
		
		object.a2(30 , 5.5);
		
		

	}

}
