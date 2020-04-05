class UDMachine{
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends UDMachine{
	public void start() {
		System.out.println("Camera started");
	}
	
	public void snap() {
		System.out.println("Photo taken");
	}
}


public class UpcastingDowncasting {
	public static void main(String[] args) {

		UDMachine machine1= new UDMachine();
		Camera camera1= new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//Upcasting
		
		UDMachine machine2= new Camera(); //this is concept of polymorphism
		UDMachine machine3= camera1; //this is upcasing as camera1 reference has risen up in hierarchy
		machine3.start();
		
		//we can't use the snap method here as the type of variable decides which methods are available to use
	
		//Downcasting
		
		UDMachine machine4= new Camera();
		Camera camera2= (Camera)machine4; //for downcasting, just like primitive type, you need confirmation
		camera2.start();
		camera2.snap(); //now you can use the snap
		

	
	}

}
