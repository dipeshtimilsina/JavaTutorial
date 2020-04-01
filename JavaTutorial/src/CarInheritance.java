public class CarInheritance extends MachineInheritance {
	public void wipeWindShield() {
		System.out.println("Wiping WindShield!");
	}
	// overriding a method
//	public void start() {
//		System.out.println("Car Started");

	@Override
	public void start() {
		System.out.println("Car Started");
	}

	public void showInfo() {
		System.out.println("Car Name: " + name);
	}
}
