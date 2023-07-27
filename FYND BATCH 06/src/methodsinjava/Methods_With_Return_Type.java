package methodsinjava;

public class Methods_With_Return_Type {
	
	// WITHOUT ARGUMENTS ********************************88
	
	public static int p1() {
		int x=10; int y= 15;
		int z= x+y;
		return z;
		
	}
   public int multiply() {
	   
	   int x = 20; int y= 10;
	   int z= x*y;
	   return z;
	   }
  
   public String p2() {
	   
	   String p = "Pankaj";
	   return p;
   }
   
	public static void main(String[] args) {
		System.out.println(p1());
		Methods_With_Return_Type obj = new Methods_With_Return_Type();
		System.out.println(obj.multiply());
		System.out.println(obj.p2());
		

	}

}
