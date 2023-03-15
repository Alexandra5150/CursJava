package curs7;

public class Exercitiu2 {

	public static void main(String[] args) {
		
//		Scriem un program care verifica daca avem nume duplicate in urmatorul array :
//		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
//		Daca le gaseste, printeaza:
//			Nume duplicat Ion
//			Nume duplicat Oana
//		Nota: O posibila solutie ar fi sa luati fiecare nume si sa il comparati cu restul.
//		Un for in for ar putea sa fie de ajutor.
		
		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
//		String i;
//		String numeDuplicat = i;
		
		
	    for (int i = 0; i<myStringArray.length; i++) {
	        for (int j = i + 1; j < myStringArray.length; j++) {
	            if (myStringArray[i] == myStringArray[j] && i != j) {
	            	
	            	System.out.println("Nume duplicat: " + myStringArray[i]);
	            }
	        }
	    }

		
	}

}
