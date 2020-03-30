
public class ArrayMultiDimensional {

	public static void main(String[] args) {
		int[][] grid = { { 3, 5, 2343 }, // row1
				{ 2, 4 }, // row2
				{ 1, 2, 3, 4 } // row3
		};
		System.out.println(grid[1][1]); // 1= row2, another 1= element2
		System.out.println(grid[0][2]);

		String[][] texts = new String[2][3];

		texts[0][1] = "Hello there";
		System.out.println(texts[0][1]);
		
		for(int row=0; row<grid.length;row++) {
			for (int column=0;column< grid[row].length;column++) {
				System.out.print(grid[row][column]+ "\t");
			}
			System.out.println();
		}
		String[][] words= new String[2][];
		System.out.println(words[0]);
		words[0]= new String[3];
		words[0] [1]= "hi there";
		System.out.println(words[0][1]);
	}
}
