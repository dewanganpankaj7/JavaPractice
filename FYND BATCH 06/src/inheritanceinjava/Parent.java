package inheritanceinjava;

public class Parent extends GrandParents{
	
 public void land() {
	 System.out.println("Land");
 }
 public void InsuranceMoney() {
	 System.out.println("Insurance Money");
 }
 public static void main(String[] args) {
	Parent p = new Parent();
	p.land();
	p.InsuranceMoney();
	p.Gold();
	p.Silver();
}
 
}

