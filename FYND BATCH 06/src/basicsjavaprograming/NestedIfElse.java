package basicsjavaprograming;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=10; int b=32; int c=40;
		if (a>b&&a>c) 
			System.out.println("A is greater than B");
		else
			if(b>c)
				System.out.println("B is greater than C");
			else
				System.out.println("C is greater tha all");
	}
		
	}


