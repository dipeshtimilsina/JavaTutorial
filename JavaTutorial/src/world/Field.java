package world;

public class Field {
 private PlantAccessModifier plant= new PlantAccessModifier();
 
 public Field() {
	 
	 //size is protected; Field is in the same package as Plant
	 System.out.println(plant.size);
 }
}
