class Froggy{
	
	private String name;
	private int id;
	
	public Froggy (int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
	}
}

public class ToStringMethod {
	public static void main(String[] args) {
		Froggy frog1= new Froggy(7, "Freddy");
		Froggy frog2= new Froggy(5, "Greeky");
		Froggy frog3= new Froggy(2, "Rocky");

		System.out.println(frog1);
		System.out.println(frog2);
		System.out.println(frog3);

	}

}
