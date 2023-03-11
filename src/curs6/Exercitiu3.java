package curs6;

import java.util.Scanner;

public class Exercitiu3 {

	public static void main(String[] args) {


//		Scriem un program care aplica un discount unei facturi.
//		Daca factura este mai mare decat 100 aplica un discount de 10%
//		Daca factura este mai mica decat 100 aplica un discount de 5%
//		Printam rezultatul
		
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		int factura;
		factura = scan.nextInt();
		
		int result = (factura>=100) ? (factura-(factura*10/100)) : (factura-(factura*5/100));
		System.out.println("Factura dupa discount este: " + result);

	}

}
