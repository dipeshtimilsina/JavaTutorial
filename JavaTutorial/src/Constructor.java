class Machine{
	private String name;
	private int code;
	
	public Machine() {
		this("Arnie, 23"); // if you are calling a constructor within a constructor,
//		make sure it is on the first line of the constructor
		System.out.println("Constructor running!");
//		name= "Arnie";
	}
	
	public Machine (String name) {
		this(name,0);
		System.out.println("Second Constructor running!");
		this.name= name;
	}
	
	public Machine (String name, int code) {
		System.out.println("Third Constructor running!");
		this.name= name;
		this.code= code;
	}
}

public class Constructor {
	public static void main(String[] args) {
		Machine machine1= new Machine();
		
		Machine machine2= new Machine ("Bertie");
		
		Machine machine3= new Machine ("Chalky", 7);
		
		new Machine(); //this is something new and interesting
	}

}
