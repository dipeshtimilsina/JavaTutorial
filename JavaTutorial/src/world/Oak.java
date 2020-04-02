package world;

public class Oak extends PlantAccessModifier {

	public Oak() {

		// won't work -- type is private
//		type= "tree";
		
		//This works -- size is protected, Oak is a subclass of plant.
		this.size= "large";
		
		//no access specifier; works because oak and plantaccessmodifier in same package
		this.height= 10;
	}

}
