package basicsjavaprograming;

import variablesinjava.NonStatic_Variables;
import variablesinjava.Static_Variables;

public class IfElseCondition {

	public static void main(String[] args) {
		int a=100;
		int b=90;
		if (a<b)
			System.out.println("A is less than B");
		else
			System.out.println("A is Greater than B");
		
		// Calling static variable is different package
		System.out.println(Static_Variables.a*Static_Variables.b);
		
		
		// Calling a non static variables in different package
		
		NonStatic_Variables obj = new NonStatic_Variables();
		System.out.println(obj.a + obj.b);
		
		

	}

}
