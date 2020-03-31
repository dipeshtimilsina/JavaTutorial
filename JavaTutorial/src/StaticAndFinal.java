class Thing {
	
	public final static int LUCKY_NUMBER= 7;
	public String name;
	public static String description; //class variable
	
	public static int count=0;
	
	public int id=0 ;
	
	public Thing() {
		
		id= count;
		count++;
	}
	
	public void showName() {
		System.out.println("Object id: "+ id+ ", "+ description+ ": " + name);
	}
	public static void showInfo() {
		System.out.println("Hello");
//		System.out.println(name); //Won't work cannot put instance variable inside static method
	}
}

public class StaticAndFinal {
	public static void main(String[] args) {
		
		Thing.description= "I am a thing!"; //Class variable
		
		System.out.println(Thing.description);
		
		Thing.showInfo();
		
		System.out.println("Before creating objects, count is: "+Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2= new Thing();
		System.out.println("Before creating objects, count is: "+Thing.count);

		
		thing1.name= "Bob";
		thing2.name="Sue";
		Thing thing3= new Thing();
		System.out.println("Before creating objects, count is: "+Thing.count);

		
//		System.out.println(thing1.name);
//		System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);

	}

}
