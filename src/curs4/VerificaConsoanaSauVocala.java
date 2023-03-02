package curs4;

import java.util.Scanner;

public class VerificaConsoanaSauVocala {

	public static void main(String[] args) {

		System.out.println("Introdu o litera:");
		
		Scanner scan = new Scanner(System.in);
		
		char ch = scan.next().charAt(0);
		
		switch(ch) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Este vocala!");
			break;
			
		default:
			System.out.println("Este consoana");
		}
		
		
	}

}
