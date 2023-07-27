package scannersinjava;

import java.util.Scanner;

public class Scanner_class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to know the factorial of number....................
		int num;
		int a=1;
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter The Number");
		num= sc.nextInt();
		int total = num;
		for(int i=1; i<=num; i++)// For loop 
		{
			a=a*i;
		}
			
			

		/*while (num!=0) // Using while loop
		 * {
			
			a=a*num;
			num--;
		}*/
		
		
		System.out.println("Favtorial of "+total+ " is :"+a);
		sc.close();
	}
	
	}