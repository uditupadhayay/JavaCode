
public class Variables {
	public static void main(String args[]){
		//This is how you give single line comment 
		
		/* This is how 
		 * you give multiline comments
		 */
		
		//Basics of the Variables
		int myFirstVar = 10 * 20 + 30;
		int mySecondVar = 12;
		int myThirdVar = 2 * myFirstVar;
		int myResult = 1000- myThirdVar;
		System.out.println("myFirstVar: " + myFirstVar );
		System.out.println("mySecondVar: " + mySecondVar );
		System.out.println("myThirdVar: " + myThirdVar );
		System.out.println("myResult: " + myResult );
		
		//Integer takes up 4 bytes
		int myMaxInt = 2147483647;  //We are using literal notation
		int myMinInt = -2_14_74_83_648; //We can use underscore to separate numbers and make it more readable 
		System.out.println("myMaxInt:" + myMaxInt);
		System.out.println("myMinInt:" + myMinInt);
		
		//byte takes up 1 byte
		byte myMaxByte = 127;
		byte myMinByte = -128;
		System.out.println("myMaxByte:" + myMaxByte);
		System.out.println("myMinByte:" + myMinByte);

		
		//short takes 2 bytes
		short myMaxShort = 32767;
		short myMinShort = -32768;
		System.out.println("myMaxShort:" + myMaxShort);
		System.out.println("myMinShort:" + myMinShort);

		
		//long takes 8 bytes
		//Something Strange going on here , long range is same as that of int ??
		//Solution: For modern 32 and 64 bit compiler both int and long are 4 bytes long, but minimum amount
		//of space required to store int is 16 bits, but for long it is 32 bits
		long myMaxLong = 2147483647;
		long myMinLong = -2147483648;
		System.out.println("myMaxLong: " + myMaxLong);
		System.out.println("myMinLong: " + myMinLong);
		
		//Casting:
		byte myCastingByte = (byte) (128/2);
		short myCastingShort =  (short) 32767 / 2;
		System.out.println("myCastingByte: " + myCastingByte);
		System.out.println("myCastingShort: " + myCastingShort);
		
		//UdemyCourse Instructor Exercise
		byte myEx1Byte = 10;
		short myEx1Short = 20;
		int myEx1Int = 30;
		long myEx1Long = 50000 + 10 * (myEx1Byte + myEx1Short + myEx1Int );
		System.out.println("myEx1Long: " + myEx1Long);
		
		//Float and double
		int myDecimalInt = 5 / 3;
		//Correct Way to assign Float is with f. 
		//Float 4 Bytes, have 7 Digits of precision 
		float myFloat = 5f/3f;
		float myFloatTest = (5f/3);
		//Correct Way to assign double is with d
		//Double 8 Bytes, have 16 Digits of precision
		double myDouble = 5d / 3d;
		System.out.println("myFloat: " + myFloat);
		System.out.println("myDecimalInt: " + myDecimalInt);
		System.out.println("myDouble: " + myDouble);
		System.out.println("myFloatTes: " + myFloatTest);
		//Why prefer double ?
		//1. Faster on Modern Compiler
		//2. More precise 
		
		//UdemyCouse Instructor Exercise Ex2
		double pound = 34d;
		double kg = pound * 0.45359237d;
		System.out.println("Kg: " + kg );
		//3. Java internal functions use double
		
		//Boolean can have two values, true or false
		boolean myBoolean1 = true;
		boolean myBoolean2 = false;
		System.out.println("myBoolean1: " + myBoolean1);
		System.out.println("myBoolean2: " + myBoolean2);
		
		//Char data type 
		char myChar1 = 'A';
		//Get the unicode 
		char myCharUnicode = '\u00AE';
		System.out.println("myChar1: " + myChar1);
		System.out.println("myCharUnicode: " + myCharUnicode);
		
		//String: Actually this is a Class, but this is very basic to java
		String myString1 = "My name is Udit";
		System.out.println("myString: " + myString1);
		myString1 = myString1 + "Upadhayay " + '\u00A9';
		System.out.println("myString: " + myString1);
		
		
	}

}
