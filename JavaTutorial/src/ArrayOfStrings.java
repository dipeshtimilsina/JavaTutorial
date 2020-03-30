public class ArrayOfStrings {
	public static void main(String[] args) {
		String[] words = new String[3];
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

		String[] fruits = { "Apple", "Banana", "Mango", "Pineapple" };
		//This is something new, the one down below
		for (String fruit: fruits) {
			System.out.print(fruit+ " ");
		}
	}

}
