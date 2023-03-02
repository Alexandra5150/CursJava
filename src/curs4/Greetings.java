package curs4;

import java.util.Scanner;

//import curs3.SimpleCalculator;

public class Greetings {

	public static void main(String[] args) {

		//SimpleCalculator obj2 = new SimpleCalculator();
		
		
		System.out.println("Te rog introdu calificativul:");
		
		Scanner obj = new Scanner(System.in);
		
		String calificativ = obj.next();
		
		switch(calificativ.toUpperCase()) {
		
		case "A":
			System.out.println("Good job");
			break;
		case "B":
			System.out.println("Not so good");
			break;
		case "C":
			System.out.println("Kind of bad");
			break;
		default:
			System.out.println("Please insert only A, B, C");
		}
		
		
	}

}
