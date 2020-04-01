public class Inheritance {
	public static void main(String[] args) {
		MachineInheritance mach1= new MachineInheritance();
		mach1.start();
		mach1.stop();
		
		CarInheritance car1= new CarInheritance();
		car1.start();
		car1.stop();
		car1.wipeWindShield();
		car1.showInfo();
	}

}
