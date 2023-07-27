package encapsulationinJava;

public class Sample {
	
	private String name;
	private int age;

	public int getAge() 
	{return age;
		}
	
	public String getName() {
		return name;
	}
		
	
	
	public void setName(String name) {
		
		if(name.length()<4||name.length()>12)
			throw new RuntimeException("Name length is between 4 to 12");
	}
	public void setAge(int age) {
	if(age <18 || age > 60)	
		throw new RuntimeException("Age must be between 18 to 60");
	}
	
	
}
	