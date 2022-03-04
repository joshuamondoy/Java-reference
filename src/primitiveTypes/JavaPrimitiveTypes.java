package primitiveTypes;

public class JavaPrimitiveTypes {

	    //primitive types - predefined
	        //numeric
	            //byte
	            //short
	            //int
	            //long
	        //decimal or fraction
	            //float
	            //double
	        //non-numeric
	            //boolean
	            //char
	    //non-primitive types - not predefined
	            //array

	   int newArr[]  = {1, 2, 3, 4, 5};



	    public static void main(String[] args) {
	        //int occupies 32 bits
	        int myValue = 1000;
	        int myMinIntValue = Integer.MIN_VALUE;
	        int myMaxIntValue  = Integer.MAX_VALUE;
	        System.out.println("Integer Minimum Value = " + myMinIntValue);
	        System.out.println("Integer Maximum Value = " + myMaxIntValue);
	        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1)); //output will become underflow
	        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1)); //output will overflow

	        //byte occupies 8 bits
	        byte myMaxByteValue = Byte.MAX_VALUE;
	        byte myMinByteValue = Byte.MIN_VALUE;
	        System.out.println("Byte Minimum Value = " + myMinByteValue);
	        System.out.println("Byte Maximum Value = " + myMaxByteValue);

	        //Short occupies 16 bits
	        short myMaxShortValue = Short.MAX_VALUE;
	        short myMinShortValue = Short.MIN_VALUE;
	        System.out.println("Short Minimum Value = " + myMinShortValue);
	        System.out.println("Short Maximum Value = " + myMaxShortValue);

	        //long occupies 64 bits
	        long myLongValue = 100L;
	        long myMaxlongValue = Long.MAX_VALUE;
	        long myMinlongValue = Long.MIN_VALUE;
	        System.out.println("long Minimum Value = " + myMinlongValue);
	        System.out.println("long Maximum Value = " + myMaxlongValue);

	        //Casting java; what's in the parenthesis is treated as an integer
	        int myTotal = (myMinIntValue / 2);
	        byte myNewByteValue = (byte)(myMinByteValue / 2); //that's why we declare bytes in parenthesis here
	        short myNewShortValue = (short)(myMinShortValue / 2); //or you can simply put L if not passed to a var

	        //primitive types challenge
	        byte byteVar = 10;
	        short shortVar = 20;
	        int intVar = 50;

	        long intLong = 50000L + 10L * (byteVar + shortVar + intVar) ;
	        System.out.println("Total is " + intLong);

	}

}
