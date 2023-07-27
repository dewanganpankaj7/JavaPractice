package stringsinjava;

public class Practice_of_StringsProblems2 {

	public static void main(String[] args) {
		String a = "abcd";
		String b = "xyz";
		String c = "abcd xyz klmn 1234 4567";
		
		//Req1: length of the a variable should be greater than length of b and should be less than length of c
       if(a.length()>b.length() && a.length()<c.length()) {
    	   System.out.println("Pass");
       } else {
    	   System.out.println("Fail");
       }
       
       System.out.println("********************************************************************");
       
       //Req2: concatenate a and b variables and verify length should be less than c variable length or greater than 5

         String ab= (a.concat(b));
         
         System.out.println(ab);
         
        if(ab.length()<c.length() && ab.length()>5) {
        	
        	System.out.println("Pass");
        } 
        else {
        	System.out.println("Fail");
        }

        System.out.println("************************************************************************");
        
        //Req3: a variable should start with “ab” and b variable should not ends with “yz”
        
        if(a.startsWith("ab")==true && b.endsWith("yz")==false) {
        	System.out.println("Pass");
        }else {
        	System.out.println("Fail");
        }
       System.out.println("***************************************************************************");
       
       //Req4: c variable should contains space and should not contains 9
       
      if(c.contains(" ")== true && c.contains("9")!=true ) {
    	  System.out.println("Pass");
      }else {
    	  System.out.println("Fail");
      }
      System.out.println("******************************************************************************");
      
      //Req5: 7th position in a c variable should be y or z and k should be available in the either 10th or 11th positions.
      
     
      if((c.charAt(7)=='y'||c.charAt(7)=='z') &&(c.indexOf('k')==10 && c.indexOf('k')==11)) {
    	  System.out.println("Pass");
      }
      else {
    	  System.out.println("Fail");
      }
      
      System.out.println("*************************************************************************************");
     
    //Req6: split c variable into multiple strings and verify length of the array should be 4 or 5
    
      String[] d1 = c.split(" ");
      
      if(d1.length==4 || d1.length==5) {
    	  System.out.println("Pass");
      }
      else {
    	  System.out.println("Fail");
      }
    
     System.out.println("************************************************************");
    //Req7: verify first string of the c variable should be same as a variable and should not be sameas 3rd string of the c variable.

     
     
     if(d1[0].equals(a) && !d1[4].equals(c)) {
    	 System.out.println("Pass");
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     }}