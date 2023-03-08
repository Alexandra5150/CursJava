package curs4;

import java.util.Scanner;

public class Tema1 {

	public static void main(String[] args) {

		/*Scriem un program care intreaba utilizatorul 10 numere sub urmatoarea forma:
		 * Please enter number 1:
		 * Please enter number 2:
		 * ---etc
		 * Dupa ce utilizatorul a introdus cele zece numere calculam suma lor si o printam sub urmatoarea forma :
		 * The sum of the numbers is:
		 * Note:
		 * Folosim instructiunea FOR
		 * Inputul userului il putem citi in for*/
		

		Scanner scan = new Scanner (System.in);
		
		int result = 0;
		int currentNumber = 0;

		for (int i=1; i<10; i++) {
		  
			System.out.println("Please enter number " + (i));
			currentNumber = scan.nextInt();
			result =result + currentNumber;
		}
		 
			System.out.println("The sum of the numbers is: " + result);
			
	}

//	int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
//	int result;
//
//	
//	System.out.println("Please enter number 1:");
//	num1 = scan.nextInt();
//	System.out.println("Please enter number 2:");
//	num2 = scan.nextInt();
//	System.out.println("Please enter number 3:");
//	num3 = scan.nextInt();
//	System.out.println("Please enter number 4:");
//	num4 = scan.nextInt();
//	System.out.println("Please enter number 5:");
//	num5 = scan.nextInt();
//	System.out.println("Please enter number 6:");
//	num6 = scan.nextInt();
//	System.out.println("Please enter number 7:");
//	num7 = scan.nextInt();
//	System.out.println("Please enter number 8:");
//	num8 = scan.nextInt();
//	System.out.println("Please enter number 9:");
//	num9 = scan.nextInt();
//	System.out.println("Please enter number 10:");
//	num10 = scan.nextInt();
//	
//	result = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
//
//	System.out.println("The sum of the numbers is: " + result);
}
