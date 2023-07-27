package scannersinjava;

import java.util.Scanner;

public class Duplicate_Characters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		String s = sc.nextLine();
		int count;
		
		char[]arry = s.toCharArray();
		System.out.println("Lenghth of the given character is : "+arry.length);
		System.out.println("Duplicate of character is :");
		
		for(int i = 0; i<arry.length; i++) {
			count = 1;
		for(int j = i+1; j<arry.length;j++) {
			
			if(arry[i]==arry[j] && arry[i]!=' ') {
				count++;
				arry[j]= '0';
			}
			
		}
		
			
			if (count>1 && arry[i]!='0') {
				System.out.println(arry[i]);
			}

			
			
			
		}
		sc.close();

		}

	}
	


