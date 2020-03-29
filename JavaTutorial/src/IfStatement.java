import java.util.Scanner;
public class IfStatement {
	public static void main (String[] args) {
		System.out.println("Enter value of a");
		Scanner sc= new Scanner (System.in);
		int a= sc.nextInt();
		System.out.println("Enter value of b");
		int b= sc.nextInt();
		if (a==b) {
			System.out.println("Yes, A is equal to B");
		}
		else if (a!=b) {
			System.out.println("No, A is not equal to B");
		}
		else {
			System.out.println("Opps! Something is wrong");
		}
	}
}
