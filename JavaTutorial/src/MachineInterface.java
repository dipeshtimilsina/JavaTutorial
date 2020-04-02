//remember that we can extend one one class but we can implement lots and lots of interfaces (seperated by commas)
public class MachineInterface implements Info {
	private int id= 7;
	
	public void start() {
		System.out.println("Machine Started!");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine ID is: "+ id);
	}
}
