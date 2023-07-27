package polymorphisminjava;

public class Method_Overloading {
	
	public void opensheet(String sname){ 
		System.out.println("Sheet open with name: "+ sname);
	}
	
	public void opensheet(int pagenumber) {
		System.out.println("Sheet open with "+ pagenumber);
	}

	public void opensheet(int pagenumber, String sname) {
		
	System.out.println("Sheet open with both "+pagenumber + sname);
	}
	public static void main(String[] args) {
		
		Method_Overloading obj=new Method_Overloading();
		obj.opensheet(7);
		obj.opensheet("Overloading");obj.opensheet(8, "Polymorphism");
	}

}
