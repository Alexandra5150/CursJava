package curs4;

import java.util.Scanner;

public class Tema4b {
	
	Scanner scan = new Scanner(System.in);
	
	int numar;
	String ziuaSaptamanii;
	
	public void askTheUser () {
	System.out.println("Please enter a number:");
	numar = scan.nextInt();	
	
	}
	
	
	 
	public void calculate () {
		
		switch(numar) {
	
		case 1:
    	  ziuaSaptamanii = "luni";
    	  printResult();
          break;
		case 2:
    	  ziuaSaptamanii = "marti";
    	  printResult();
          break;
		case 3:
    	  ziuaSaptamanii = "miercuri";
    	  printResult();
          break;
		case 4:
    	  ziuaSaptamanii = "joi";
    	  printResult();
          break;
		case 5:
    	  ziuaSaptamanii = "vineri";
    	  printResult();
          break;
		case 6:
    	  ziuaSaptamanii = "sambata";
    	  printResult();
          break;
		case 7:
    	  ziuaSaptamanii = "duminica";
    	  printResult();
          break;
		default:
		System.out.println("Te rugam sa introduci un numar intre 1 si 7");
		}

	}
	
	
	public void printResult() {
		System.out.println("ziua saptamanii este: " + ziuaSaptamanii);
	}
}
