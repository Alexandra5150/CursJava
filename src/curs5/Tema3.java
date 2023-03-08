package curs5;

import java.util.Scanner;

public class Tema3 {
	
//	Folosind un FOR scriem un program care verifica daca un cuvant este Palindrom.
//	Un palindrom este un șir de caractere (de obicei cuvinte, fraze sau numere) care citit de la stânga la dreapta sau de la dreapta la stânga rămâne neschimbat
//	Ex : radar (daca citim de la final, tot acelasi inteles are)

	public static void main(String[] args) {

		System.out.println("Te rog sa introduci un cuvant: ");
		Scanner scan = new Scanner(System.in);
		
	    String cuvant; 
	    String cuvantInversat = "";
	    cuvant = scan.next().toLowerCase();
	    
	    int lungimeCuvant = cuvant.length();

	    for (int i = (lungimeCuvant - 1); i >=0; --i) {
	    	cuvantInversat = cuvantInversat + cuvant.charAt(i);
	    }

	    if (cuvant.equals(cuvantInversat)) {
	      System.out.println(cuvant + " este Palindrom");
	    }
	    else {
	      System.out.println(cuvant + " NU este Palindrom");
	    }

	}

	
}
