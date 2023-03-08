package curs4;

import java.util.Scanner;

public class Tema4 {

	public static void main(String[] args) {
		/* Scriem un program care intreaba utilizatorul un numar.
		 * Avem un switch care pentru fiecare numar de la 1 la 7 atribuie o valoare reprezentand una din zilele saptamanii unei variabile care se numeste ziuaSaptamanii.
		 * Daca utilizatorul introduce orice numar peste 7 va primi mesajul “Te rugam sa introduci un numar intre 1 si 7”
		 * Daca a fost introdus un numar valid se va printa : ”ziua saptamanii este <ziua aferenta nr introdus>”*/

		Scanner scan = new Scanner(System.in);
		
		int numar;
		
		System.out.println("Please enter a number:");
		numar = scan.nextInt();		
		
		String ziuaSaptamanii;
		 
		
		switch(numar) {
		
	      case 1:
	    	  ziuaSaptamanii = "luni";
	    	  System.out.println("ziua saptamanii este: " + ziuaSaptamanii);
	          break;
	      case 2:
	    	  ziuaSaptamanii = "marti";
	    	  System.out.println("ziua saptamanii este: " + ziuaSaptamanii);
	          break;
	      case 3:
	    	  ziuaSaptamanii = "miercuri";
	    	  System.out.println("ziua saptamanii este: " + ziuaSaptamanii);
	          break;
	      case 4:
	    	  ziuaSaptamanii = "joi";
	    	  System.out.println("ziua saptamanii este: " + ziuaSaptamanii);
	          break;
	      case 5:
	    	  ziuaSaptamanii = "vineri";
	    	  System.out.println("ziua saptamanii este: " + ziuaSaptamanii);
	          break;
	      case 6:
	    	  ziuaSaptamanii = "sambata";
	    	  System.out.println("ziua saptamanii este: " + ziuaSaptamanii);
	          break;
	      case 7:
	    	  ziuaSaptamanii = "duminica";
	    	  System.out.println("ziua saptamanii este: " + ziuaSaptamanii);
	          break;
		default:
			System.out.println("Te rugam sa introduci un numar intre 1 si 7");
		}
		
	
		
	}
	
	

}
