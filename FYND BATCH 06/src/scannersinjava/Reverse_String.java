package scannersinjava;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "Pankaj";
		String d = "I love fynd academy";
		String[] arr1= d.split(" ");		
		String[] arr= p.split("");
		
		
		System.out.println("Lenth of string is : "+ arr.length);
		
		for(int i =arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			
		}
		System.out.println("_________________________________");
      System.out.println("Length of string : "+ arr1.length);
      for(int i=arr1.length-1; i>=0;i--) {
    	  System.out.print( arr1[i]+ " ");
      }
	}

}
