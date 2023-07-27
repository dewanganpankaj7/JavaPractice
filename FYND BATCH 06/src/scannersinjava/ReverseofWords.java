package scannersinjava;

import java.util.Scanner;

public class ReverseofWords {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the words you want to reverse");
		String s = sc.nextLine();
		String arr[]= s.split(" ");
		
		System.out.println("After Reversing the word ");
		for(int i= arr.length-1; i>=0; i--) {
			
			System.out.print(arr[i]+ " ");
		}
sc.close();
	}

}
