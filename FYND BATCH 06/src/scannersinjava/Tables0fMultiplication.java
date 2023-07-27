package scannersinjava;

import java.util.Scanner;

public class Tables0fMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to print multipication Table");
		int n = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			
			int table = i*n;
			System.out.println(n+"*"+ i+"="+table );
			
		}
		sc.close();
	}

}
