package Constructorsinjava;

public class Student {
	
	int maths; int physics;
	
	Student(int a , int b){
		
		maths = a; physics = b;
		}
		
	public void Total() {
		int total = maths + physics; 
		System.out.println(total);
	}
    public void Average() {
    	int Average = (maths + physics)/2 ;
    	System.out.println(Average);
    	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud1= new Student(70, 80);
		Student stud2 = new Student(90, 100);
	
		
	stud1.Total(); stud1.Average();
	stud2.Average();
	
				

	}

}
