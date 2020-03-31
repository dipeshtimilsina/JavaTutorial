class Frog{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class SetterAndThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog1= new Frog();
		
//		frog1.name= "Dipesh";
//		frog1.age= 1;
		frog1.setName("Dipesh");
		frog1.setAge(1);
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
	}

}
