import world.*;
public class PublicPrivateProtected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PlantAccessModifier plant= new PlantAccessModifier();
			
			System.out.println(plant.name);
			System.out.println(plant.ID);
			
			//won't work--  type is private
//			System.out.println(plant.type);
			
			//size is protected; PublicPrivateProtected is not in the same package as Plant
//			System.out.println(plant.size);
	}

}
