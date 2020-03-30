public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val=7; // This is value
		int[] value= new int[3]; //this is reference and the use of 'new' creates memory to store 4 values
		System.out.println(value[0]);
		value[1]= 55;
		value[2]= 35;
		System.out.println(value[1]+" "+ value[2]);
		
		for (int i=0; i<value.length;i++) {
			System.out.println(value[i]);
		}
		
		int[] numbers= {2,3,4};
		for (int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

}
