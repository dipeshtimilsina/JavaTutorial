
public class WhileLoop {
	public static void main (String[] args) {
		double number= 6.6;
		boolean sc1= 5>6;
		boolean sc2= 7>6;
		boolean sc3= number>6;

		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(sc3);
		
		int value=0;
		
		while (value<10) {
			System.out.println("Hello there! " + value);
			value+=1;
		}
	}
}
