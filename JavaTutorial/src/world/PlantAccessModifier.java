package world;

public class PlantAccessModifier {
	//Bad Practice
	public String name;
	
	//Acceptable practice-- it's final
	public final static int ID = 8;

		private String type;
		
		protected String size;
		
		int height;
	
	public PlantAccessModifier() {
		this.name= "Freddy";
		this.type= "plant";
		this.height= 7;
		
		this.size= "medium";
	}
}
