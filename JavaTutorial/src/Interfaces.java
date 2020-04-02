
public class Interfaces {

	public static void main(String[] args) {

		MachineInterface mach1= new MachineInterface();
		mach1.start();
		
		PersonInterface person1= new PersonInterface("Dipesh");
		person1.greet();
		
		Info info1= new MachineInterface();
		info1.showInfo();
		
		Info info2= person1;
		info2.showInfo();
		
		
		outputInfo(mach1);
		outputInfo(person1);
	}
	public static void outputInfo (Info info) {
		info.showInfo();
	}
}
