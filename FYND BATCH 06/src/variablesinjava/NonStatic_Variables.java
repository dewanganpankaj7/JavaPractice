package variablesinjava;

public class NonStatic_Variables {
	
	public int a= 40; public int b = 40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStatic_Variables obj = new NonStatic_Variables(); // creating object for non static variables
		
		System.out.println(obj.a + obj.b);
	}
}
