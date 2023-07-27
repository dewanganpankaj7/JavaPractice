package scannersinjava;

import java.util.Scanner;

public class Prograaming_Of_Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character ");
		String s = sc.nextLine();
		int l = s.length();
		System.out.println("Length of character is: "+l);
		
		char last= s.charAt(l-1);
		char frst= s.charAt(0);
		String rem = s.substring(1, l-1);
		String result = last+rem+frst;
		System.out.println(result);
			sc.close();
		
		
		
	}

}
