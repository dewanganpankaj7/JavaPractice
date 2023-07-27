package Constructorsinjava;

public class Constructor_With_Arguments {
	
	int x; String y; int z;
	Constructor_With_Arguments (int a, String b){
		
		x=a;
		y = b;
		}
	public Constructor_With_Arguments(int a, int b) {
		
		x=a;
		z=b;
	}
	
	public void m1() {
		System.out.println(x + " "+ y);
		
	}
  public void m2() {
	 System.out.println(x+z);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Constructor_With_Arguments obj1= new Constructor_With_Arguments(12, "Pankaj");
   Constructor_With_Arguments obj2 = new Constructor_With_Arguments(20, 30);
   
   obj1.m1();
   obj2.m2();
	}

}
