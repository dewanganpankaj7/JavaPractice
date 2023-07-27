package inheritanceinjava;

class Gajendra {
	public void Car() 
	{System.out.println("Car");}
	
	public void home() {
		System.out.println("Home");
	}
	}
class Mayank extends Gajendra {
	public void megha() {
		System.out.println("Megha");
	}
}
public class Pankaj_ extends Gajendra {
	public void nothing() {
		System.out.println("Pankaj Has Nothing");
	} 

	public static void main(String[] args) {
		
	Mayank m=new Mayank();
	Pankaj_ p= new Pankaj_();
	m.Car();m.home();m.megha();
	p.Car();p.home();p.nothing();
	

	}

}
