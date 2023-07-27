package variablesinjava;

public class Local_Variable {
	
	public static void a1(){
		int a= 20; int b= 30;// local variables
		System.out.println(a*b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a1();
		
		System.out.println(Static_Variables.a*Static_Variables.b);// calling static variables in different class
		
		
        NonStatic_Variables obj1 = new NonStatic_Variables(); // Calling non static variables in different class by creating 
        //an object
        
        System.out.println(obj1.a*obj1.b); 
        
        System.out.println("Value of a is : " + Access_Specifiers.a);// Access specifiers calling
	}

}
