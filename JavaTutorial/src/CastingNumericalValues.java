public class CastingNumericalValues {
	public static void main(String[] args) {
		
		byte byteValue= 20;
		short shortValue=  55;
		int intValue= 888;
		long longValue= 23355;
		
		float floatValue= 88884.8f;
		
		float floatValue2= (float)99.3;
		
		double doubleValue= 32.4;
		
		System.out.println(Byte.MAX_VALUE);
	
		intValue= (int)longValue; //this is typecasting
		
		System.out.println(intValue);
		
		doubleValue= intValue;
		
		System.out.println(doubleValue);
		
		intValue= (int)floatValue;
		System.out.println(intValue); //it won't round off.... it will chop off the decimal only
		
		//The following will give wrong output, something that we arean't expecting
		//it will go to negative and ruin things... 128 is too big for a byte
		byteValue= (byte)130; 
		System.out.println(byteValue);
		
	
	}

}
