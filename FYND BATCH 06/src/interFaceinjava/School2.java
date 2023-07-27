package interFaceinjava;

interface Software{
	
	public void startdate(); 
	public void endDate();
	public void fees(); 
}

class School1 implements Software{
	
	public void startdate() {System.out.println("Star date is 16th July");}
	public void endDate() {System.out.println("End date is 20th July");}
	public void fees() {System.out.println("fees is rs 20,000");}
}


public class School2 implements Software{
	public void startdate() {System.out.println("Star date is 16th june");}
	public void endDate() {System.out.println("End date is 20th june");}
	public void fees() {System.out.println("fees is rs 10000");}
	
	
	public void sports() {System.out.println("Sports of School 2 class");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Software soft= new School1();
		soft.startdate();
		soft.endDate();
		soft.fees();
		
		School2 scl2=new School2();
		scl2.sports();
	 
		Software soft2=new School2();
		soft2.startdate();
		soft2.endDate();
		soft2.fees();

	}

}
