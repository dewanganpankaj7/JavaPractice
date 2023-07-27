package Constructorsinjava;

public class Constructor_Without_Arguments {
	
	// creating constructor without arguments
	
	Constructor_Without_Arguments (){
		
		System.out.println("This is constructor class");
	}
	
	public void m1() {
		System.out.println("This is method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor_Without_Arguments obj= new Constructor_Without_Arguments();
		obj.m1();
	}

}
