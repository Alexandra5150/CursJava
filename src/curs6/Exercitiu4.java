package curs6;

import java.util.Scanner;

public class Exercitiu4 {

	public static void main(String[] args) {


//		Rescriem programul de mai jos folosind if-else
//
//		int comision;
//		int vanzari = 3500;
//		comision = (vanzari > 2500) ? vanzari * 5 / 100 : 0;
//		
//		System.out.println("Comisionul tau este: " + comision);

		
		int comision;
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		int vanzari = scan.nextInt();
		
		if(vanzari > 2500) {
			comision = vanzari * 5 / 100;
		} else {
			comision = 0;
		}
		
		System.out.println("Comisionul tau este: " + comision);
		
	}

}
