
public class StringBuilderAndStringFormatting {
	public static void main (String[] args) {
		
		//This is inefficient
		String info= "";
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		System.out.println(info);
		
		
		//more efficient
		StringBuilder sb= new StringBuilder("");
		sb.append("My name is Dipesh.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		System.out.println(sb.toString());
		
		StringBuilder s= new StringBuilder();
		
		s.append("My name is Roger")
		.append (" ")
		.append ("I am a skydriver.");
		
		System.out.println(s.toString());
		
		
		//String Formatting //////////
		
		System.out.println("Here is the text\tThat was a tab \nThat was a new line.");
		
		//Formatting Integers
		System.out.printf("Total cost is %-5d; quantity is %5d\n", 5, 120);	
		
		for (int i=0; i<20;i++) {
			System.out.printf("%-2d: %s \n", i, "Some text here");
		}
		
		
		// Formatting floating point values
		System.out.printf("Total value: %.2f\n", 5.6874);
		System.out.printf("Total value: %6.1f\n", 343.23423);
	}
}
