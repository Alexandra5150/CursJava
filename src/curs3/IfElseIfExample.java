package curs3;

import java.util.Scanner;

/**
 * intrebam userul punctajul unui test si ii atribuim un calificativ
 * daca a obtinut un punctaj <= 90 --> B
 * daca a obtinut un punctaj <= 80 --> C
 * daca a obtinut un punctaj <= 70 --> D
 * daca a obtinut un punctaj <= 60 --> E
 * daca are peste 90 --> A
 */


public class IfElseIfExample {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Ce punctaj ai obtinut?");
		int punctaj = scan.nextInt();
		
		
		
		
	/*	if (punctaj <= 60) {
			System.out.println("Calificativul primit este E");
			
		} else if (punctaj <= 70) {
			System.out.println("Calificativul primit este D");
			
		} else if (punctaj <= 80) {
			System.out.println("Calificativul primit este C");
			
		} else if (punctaj <= 90) {
			System.out.println("Calificativul primit este B");
			
		} else {
			System.out.println("Calificativul primit este A");
			
		}*/
		
		
		char calificativ;
		
		if (punctaj <= 60) {
		calificativ = 'E';
		
	} else if (punctaj <= 70) {
		calificativ = 'D';
		
	} else if (punctaj <= 80) {
		calificativ = 'C';
		
	} else if (punctaj <= 90) {
		calificativ = 'B';
		
	} else {
		calificativ = 'A';
		
	}	
		
		
		System.out.println("Calificativul primit este : " + calificativ);
		
	} 
		
		

}

