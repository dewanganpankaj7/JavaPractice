package stringsinjava;

public class Functions_Of_Strings {

	public static void main(String[] args) {
		
    String a="PANKAJ";
    String c="Pankaj";
    String b="dewangan";
    String d="Dewangan";
    System.out.println(a.length());
    System.out.println(a.startsWith("P"));
    System.out.println(a.endsWith("J"));
    System.out.println(a.toLowerCase());
    System.out.println(b.toUpperCase());
    System.out.println(a.equals(c));// Upper Case Lower case matters alaot o/p will be false
    System.out.println(b.equalsIgnoreCase(d));// upper case lower case doent matterr o/p will be true
    System.out.println(a.contains("KAJ"));
	}

}
