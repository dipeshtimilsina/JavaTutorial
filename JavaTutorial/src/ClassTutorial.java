public class ClassTutorial {
	public static void main(String[] args) {
			
		Person person1= new Person();
		Person person2= new Person();
		person1.name= "Dipesh Timilsina";
		person1.age= 37;
		person2.name= "Ramu";
		person2.age= 38;
		
		System.out.println(person1.name);
		System.out.println(person2.age);
	}

}



class Person{
	/*Classes can contain
	 * 1. Data
	 * 2. Subroutines (Methods)
	 */
	
	//Instance variables (data or state)
	String name;
	int age;
}
