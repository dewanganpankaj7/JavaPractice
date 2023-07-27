package scannersinjava;

import java.util.Scanner;

public class Even_Odd_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}
sc.close();
	}

}
