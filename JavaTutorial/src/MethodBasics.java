public class MethodBasics {
	public static void main(String[] args) {

		Persons person1 = new Persons();
		Persons person2 = new Persons();
		person1.name = "Dipesh Timilsina";
		person1.age = 37;
		person2.name = "Ramu";
		person2.age = 38;

		System.out.println(person1.name);
		System.out.println(person2.age);
		person1.speak();
		person2.speak();
	}

}

class Persons {
	/*
	 * Classes can contain 1. Data 2. Subroutines (Methods)
	 */

	// Instance variables (data or state)
	String name;
	int age;

	void speak() {
		System.out.println("Hello " + name+ " you are "+ age+ " years old");
	}
}
