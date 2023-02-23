package curs1;

//--one line comment

/*
 * multi line
 * comment
 */

public class FirstClass {
	
	//este o variabila de instanta -> are nevoie de un obiect al clasei pt care este utilizata
	String nume = "Ioana";
	int varsta = 25;
	
	

	//metoda main- metoda principala de executie
	public static void main(String[] args) {

		System.out.println("buna seara");
		
		FirstClass obiect = new FirstClass();
		

		//este o variabila locala
		String prenume = "Ana";


		System.out.println(prenume);

		System.out.println(obiect.nume);
		
		
		
	}

}
