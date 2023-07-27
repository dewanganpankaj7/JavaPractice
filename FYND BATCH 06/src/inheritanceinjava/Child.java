package inheritanceinjava;

public class Child extends Parent {

	
	public void shares() {
		System.out.println("Shares");
	}
	
	public void bike() {
		System.out.println("Bike");
	}
	public static void main(String[] args) {
		
		Child obj= new Child();
		obj.bike();//From child class
		obj.land();// From parent class
		obj.InsuranceMoney();//From parent class
		obj.Gold();// from grand parents class
		obj.Silver();//from grandparents class
		
		Parent p1=new Parent();
		p1.InsuranceMoney();//For parent class we can only access properties of parent class only
		p1.land();
		p1.Gold();//From granparents class
		p1.Silver();//from granparents class

	} 

}
