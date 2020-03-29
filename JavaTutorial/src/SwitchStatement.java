import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a command");
		String text = sc.nextLine();

		switch (text) {
		case "Start":
		case "start":
			System.out.println("Machine Started");
			break;

		case "Stop":
			System.out.println("Machine stopped");
			break;
		
		case "Running":
			System.out.println("Machine running");
			break;
		default:
			System.out.println("Command not recognized");
		}
	}

}
