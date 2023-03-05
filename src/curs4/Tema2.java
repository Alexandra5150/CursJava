package curs4;

import java.util.Scanner;

public class Tema2 {

	public static void main(String[] args) {


		/*Scriem un program care intreaba utilizatorul un numar si printeaza tabla inmultirii acelui numar de la 1 la 10
		 * Exemplu : Please enter a number:
		 * 3
		 * Printam :
		 * 3 * 1 = 3
		 * 3 * 2 = 6
		 * 3 * 3 = 9
		 * ----etc*/

		Scanner scan = new Scanner(System.in);
		
	
		int number;
		int result;
		char operation = '*';
		
		
		System.out.println("Please enter a number:");
		number = scan.nextInt();
		
		for (int i=1; i<=10; i++) {
			
			

			
			result = number * i;
			
			
			System.out.println(number + " " + operation + " " + i + " = " + result);
			
			
		}
		
	}

}
