package abstractionInJava;

abstract class  FirstRelease{
	public void OnlineClass() {
		System.out.println("Online Classes will start ");
		
	}	
	public void Offline() {}
	public void Zoommeeting() {}
}

abstract class SecondRelease extends FirstRelease{
	
	public void Offline() {
		System.out.println("Offline classes will start ");
	}
}
public  class Final_Release extends SecondRelease{
	
	public void Zoommeeting() {
		System.out.println("Classes will start in Zoom Meeting");
	}

	public static void main(String[] args) {
		
		Final_Release obj = new Final_Release();
		obj.OnlineClass();
		obj.Offline();
		obj.Zoommeeting();
	}

}
