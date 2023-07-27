package basicsjavaprograming;

public class NestedConditionPracticeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; int b=20; int c=30; int d=40;
		if (a>b||a>c||a>d)
			System.out.println("A is greater than All");
		else
			if(b>a&&b>c)
				System.out.println("B is greater tha all");
			else
				if (c>a&&c>b&&c>d)
					System.out.println("C is greater than all");
				else
					System.out.println("D is greater than all");

	}

}
