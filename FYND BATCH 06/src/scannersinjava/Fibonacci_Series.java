package scannersinjava;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till you want fibonacci series : ");
		int n = sc.nextInt();
		int a =0; int b=1; int c;
		for(int i =1; i<=n; i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
			
			
			
		}
		sc.close();
	}

}
