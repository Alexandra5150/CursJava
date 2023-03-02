package curs4;

import java.util.Scanner;

public class LetterSearch {

	public static void main(String[] args) {

/**
 * facem un program care citeste un string de la tastatura
 * cautam in string daca contine litera A
 * daca o gasim , printam ca A exista in text
 * daca nu, printam ca A nu exista
 * si printam si de cate ori exista daca o gasim
 */
		
		System.out.println("Please enter a text:");
		Scanner scan = new Scanner (System.in);
		String text = scan.next().toUpperCase();
		//text = text.toUpperCase();
		
		//masina
		//012345
		
		int counter = 0;
		
		for(int i=0; i<text.length(); i++) {
			
			if(text.charAt(i) == 'A') {
				
				counter++;
			}
			
		}
		
		
		if (counter > 0) {
			System.out.println("Litera A exista in text de: " + counter);

		} else {
			System.out.println("Litera A nu exista in text");
		}

	}

}
