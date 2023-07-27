package polymorphisminjava;

class A {
	public void a1() {
		System.out.println("A1 method of class A");
	}
}
class B extends A {
	
	public void a1() {
		
		System.out.println("A1 method of class B");
	}
}
class C extends B {
	public void a1() {
		System.out.println("A1 Method of class C");
	}
}

public class Method_Overriding extends C{

	public static void main(String[] args) {
		
		Method_Overriding mo = new Method_Overriding();
		mo.a1();
	
		

	}

}
