import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int a=0;
		do {
			System.out.println("Enter the correct number between 0-9");
			a= sc.nextInt();
		}while (a!=5);
		
		System.out.println("Got 5!");
	}

}
