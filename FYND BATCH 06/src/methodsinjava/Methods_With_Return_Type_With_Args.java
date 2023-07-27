package methodsinjava;

public class Methods_With_Return_Type_With_Args {
	
	public static int pankaj(int a, int b) {
		
		int c= a+b;
		return c;
		
	}
  
	public String dewangan(String a, String b) {
		
      String c = a + b;
      return c;
		
	}
	
	public int divide(int p, int d) {
		
		int e = p/d;
		return e;
	}
	public static void main(String[] args) {
		
		System.out.println(pankaj(10, 20));
		
		Methods_With_Return_Type_With_Args pan = new Methods_With_Return_Type_With_Args();
		 
		System.out.println(pan.dewangan("Pankaj","20"));
		
		System.out.println(pan.divide(30, 10));
		

	}

}
