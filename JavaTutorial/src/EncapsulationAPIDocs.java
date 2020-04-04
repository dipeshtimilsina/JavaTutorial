//https://docs.oracle.com/javase/7/docs/api/java/lang/String.html


class EncapPlany{
	private String name;
	
	public static final int ID=7;
	
	public String getData() {
		String data= "some stuff"+ calculateGrowthForecast();
		return data; 
	}
	
	private int calculateGrowthForecast() {
		return 9;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class EncapsulationAPIDocs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
