package stringsinjava;

public class Practice_of_StringsProblems {

	public static void main(String[] args) {
		String a= "abcdef";
		String b= "xyz1234";
		String c= "abcxy";
		
		//1. Verify length of the a variable should be greater than length of the c variable and should be less than length of the b variable.

		
		if(a.length() > c.length() && a.length()<b.length()){
			System.out.println("Pass");
		}
		else	{
		System.out.println("Fail");
		}
		
		
		System.out.println("-------------------------------------------------------------------");
		
		//2. A variable should not be same as b variable and c variable

		if(a.equals(b)==false && a.equals(c)==false) {
		System.out.println("Pass");
		}
		else  {
			System.out.println("Fail");}
		
		System.out.println("----------------------------------------------------------------------------");
		
		//3. C variable should be same as a variable irrespective of the case.


		boolean x = (a.equalsIgnoreCase(c));
		System.out.println("Is A variable is same as C variable - "+" "+x);
		System.out.println("--------------------------------------------------------------------------");
		
		//4. A variable should contains cd and should not contains xy

		
		if(a.contains("cd")==true && a.contains("xy")==false)
		System.out.println("Pass");
		else
			System.out.println("Fail");
		System.out.println("-------------------------------------------------------------------------------");
		
		//5. Convert b variable into uppercase and verify it should contains “Z” & should not contains “z”

		
		String B1= (b.toUpperCase());
		
		System.out.println("Upper case of variable B = "+B1+" ");
		
		if(B1.contains("Z")== true && B1.contains("z")!= true)
			System.out.println("Pass ");
		else
		
		System.out.println("Fail");
		
		
		
		


	}

	}
