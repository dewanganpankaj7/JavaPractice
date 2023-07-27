package javaAssignment;

class Cricket{
	public void t20worldcup() {
    System.out.println("Cricket Worldcup is in australia");		
	}
	
}

class Sports extends Cricket {// overriding
	public void fifa22() {
		System.out.println("Football World Cup is in Qatar");}
	
	public void playerName(String name) {
		System.out.println(name +" is Footballer");}
	
	public void playerName(String name, int runs) {
		System.out.println(name + " is Cricketer with "+runs + "+ International Runs");//overloading 
	}
}

abstract class Testtrophy{
	public abstract void trophy();
}
 
class Trophy extends Testtrophy {
	public void trophy() {
		System.out.println("India has all trophy i.e Worldcup, T20 world cup, TestMace");
	}
}

interface ipl{
	
public void csk();
public void mumbaiindians();
public void rCB();
}

class Encapsulation{ // Encapsulation
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
		
	}
}
public class Main_Class implements ipl {// Interface and main Class
	
	public void csk() {
		System.out.println("Chennai 4 times Ipl champions");
	}
	public void mumbaiindians() {
		System.out.println("Mumbai is 5 times IPL Champions");
	}
	public void rCB() {
		System.out.println("Bangalore is yet to win a single title");}

	public static void main(String[] args) {
		
		Sports sp = new Sports();// Creation of onjects
		sp.t20worldcup();// by objects calling the method of cricket class with inheritance
		sp.fifa22();
		sp.playerName("Messi");
		sp.playerName("Virat Kohli", 10000);
		
		Trophy tp = new Trophy();
		tp.trophy();
		
		ipl ip = new Main_Class();
		ip.csk();
		ip.mumbaiindians();
		ip.rCB();
      Encapsulation encap = new Encapsulation();
      encap.setName("Pankaj");
      System.out.println("Java Assignment by : "+ encap.getName());
		
	}

}
