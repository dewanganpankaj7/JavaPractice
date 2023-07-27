package scannersinjava;


import java.util.Scanner;

public class Scanner_Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // WAP to reverse the number
		
		int num, rem;
		int sum = 0;
		
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Number");
	 
	 num= sc.nextInt();
	 
	 while (num>0) {
		 
		 rem = num%10;
		 sum= sum*10+ rem;
		 num = num/10;
		 
	 }
	System.out.println("Reverse number is "+ sum);
	sc.close();
	}

}
