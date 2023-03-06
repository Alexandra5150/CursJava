package curs5;

public class DataTypesExample {

	public static void main(String[] args) {
		
		// Tipuri de date Integer (intregi)
		
		byte byteNumber = 127;
		short shortNumber = 32767;
		int intNumber = 2147483647;
		long longNumber = 9223372036854775807L;
		
		// Tipuri de date float (cu cifre zecimale)
		
		float floatNumber = 3.14F; //6-7 cifre zecimale
		double doubleNumber = 3.123456789012345; // aprox 15 cifre zecimale
		
		//char
		char caracter = 'A'; //un singur caracter unicode
		
		boolean booleanValue = true; //true sau false
		
		
		System.out.println("Tipuri de date in Java: ");
		System.out.println("byte:" + byteNumber);
		System.out.println("short:" + shortNumber);
		System.out.println("int:" + intNumber);
		System.out.println("long:" + longNumber);
		System.out.println("float:" + floatNumber);
		System.out.println("double:" + doubleNumber);
		System.out.println("char:" + caracter);
		System.out.println("boolean:" + booleanValue);
		
		
	}

}
