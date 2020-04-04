//See this part again :) 
public class Polymorphism {
	public static void main(String[] args) {
		PlantPoly plant1= new PlantPoly();
		Tree tree= new Tree();
		
		PlantPoly plant2 = tree;
		
		plant2.grow();
		plant1.grow();
		tree.shedLeaves();
//		plant2.shedLeaves(); //there's no shedLeaves on PlantPoly to use Polymorphism 
		doGrow(tree);
	}
	
	public static void doGrow(PlantPoly plant) {
		plant.grow();
	}
	}

