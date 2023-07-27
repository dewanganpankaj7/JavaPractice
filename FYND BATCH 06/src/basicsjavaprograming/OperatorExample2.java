package basicsjavaprograming;

public class OperatorExample2 {

	public static void main(String[] args) {
		
		int a=80;
		int b=45;
		int c=95;
		// for AND operator - one right one wrong then it is false
		System.out.println(a>b&&b>c);
		
		// for OR operator - one right one wrong the it is true
		System.out.println(a<c||b>c);

	}

}
