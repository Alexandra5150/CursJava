package curs5;

import java.util.Scanner;

public class WhileLoopExample {

	/*
	 * Facem un program care calculeaza salariul pe o saptamana (va fi un ratePerHour + hoursWorked
	 * Intrebam userul cate ore a lucrat
	 * calculam doar daca numarul de ore este intre 1 si 40
	 * daca nr de ore este invalid il rugam sa mai introduca o data
	 */
	
	public static void main(String[] args) {


		int ratePerHour = 15;
		
		System.out.println("Cate ore ai lucrat saptamana aceasta?");
		Scanner scan = new Scanner(System.in);
		
		int hoursWorked = scan.nextInt();
		
		while(hoursWorked < 1 || hoursWorked > 40) {
			System.out.println("Numar invalid de ore");
			System.out.println("Te rog introdu un numar intre 1 si 40");
			hoursWorked = scan.nextInt();
		}
		
		System.out.println("Salariul de platit este: " + hoursWorked * ratePerHour);

	}
	
//	boolean flag = true;
//	while(flag) {
//		if(hoursWorked < 1 || hoursWorked >40) {
//			System.out.println("Nr invalid de ore");
//			System.out.println("Te rog introdu un numar intre 1 si 40");
//			hoursWorked = scan.nextInt();	
//		}else {
//			flag = false;
//		}
//	}

	
	
}
