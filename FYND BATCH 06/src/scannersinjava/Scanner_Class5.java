 package scannersinjava;

import java.util.Scanner;

public class Scanner_Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Armstrong number
		int n, arm=0, rem;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n= sc.nextInt();
		int c=n;
		while(n>0) {
			
		rem=n%10;
		arm=arm+ (rem*rem*rem);
		
		n=n/10;
	
			
		}
		if (c==arm)
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong number");
		
		sc.close();
	

	}

}
