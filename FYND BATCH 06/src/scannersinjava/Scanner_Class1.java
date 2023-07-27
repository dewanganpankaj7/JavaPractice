package scannersinjava;

import java.util.Scanner;

public class Scanner_Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to read in a console of two integer value and multiply both the inetegrs
		
		Scanner scr= new Scanner(System.in);
		
		System.out.println("Enter the Number A");
		
		int a = scr.nextInt();
		
		System.out.println("Enter the Number B");
		int b= scr.nextInt();
		
		System.out.println(a*b);
	scr.close();
		

	}

}
