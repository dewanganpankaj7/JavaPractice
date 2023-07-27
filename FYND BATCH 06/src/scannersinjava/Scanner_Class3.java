package scannersinjava;

import java.util.Scanner;

public class Scanner_Class3 {

	public static void main(String[] args) {
		// Sum of digit program
		
		int num, rem;
		int sum=0;
		
		Scanner pd= new Scanner(System.in);
		 
		System.out.println("Enter the number");
		
		num= pd.nextInt();
		
		while(num!=0) {
			
			rem= num%10;
			sum= sum+rem;
			num=num/10;
	}
       System.out.println("Sum of a number is "+  sum);
       pd.close();
	}
   
}
