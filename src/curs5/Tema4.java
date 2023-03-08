package curs5;

import java.util.Scanner;

public class Tema4 {

//	Folosind WHILE scriem un program care cere un numar de la tastatura si il printeaza inversat.
//	Ex : daca userul introduce 1234, vom printa 4321
	
	
	public static void main(String[] args) {

	      int numar = 0;
	      int numarInversat = 0;
	      
	      System.out.println("Adauga numarul: ");
	      
	      Scanner scan = new Scanner(System.in);	      
	      numar = scan.nextInt(); 


	      while (numar != 0) {

	    	  int ultimaCifra = numar % 10;
	    	  numarInversat = numarInversat * 10 + ultimaCifra;	    	  
	          numar = numar/10;
	      }

	      System.out.println("Numarul inversat este: " + numarInversat);	
	}

}
