package Class_Objects;

public class Button {
	
	int a; int b; String c;

	public Button(int height, int width, String name) {	
		a= height; b = width; c = name;
	}
	
	public void buttoncreate() {
		System.out.println("Button is Clickable with: " +a+" "+b+" "+c );
	}
    public void buttonclickable() {
    	System.out.println(c + " Clickable");
    }
  	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		Button obj = new Button(25, 40, "anchor");
  		obj.buttoncreate();
  		obj.buttonclickable();

	}

}
