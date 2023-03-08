package curs5;

import java.util.Scanner;

public class Tema1 {
	
//	Scriem o secventa de numere Fibonacci folosind o structura for si inca o data folosind o structura while
//	Avem o variabila pentru cate numere vrem sa calculam care are val 9
//	Avem doua numere cu care incepem 0 si 1
//	Seria se calculeaza asa (un numar este seria numerelor precedente)
	

	public static void main(String[] args) {

		rezolvareCuFor();
		//rezolvareCuWhile();

	}

	public static void rezolvareCuFor() {
	
	
		int numereDeCalculat = 9; 
		int primulNumar = 0; 
		int alDoileaNumar = 1;
		System.out.print("Seria Fibonacci pentru " + numereDeCalculat + " numere: ");

		for (int i = 1; i <= numereDeCalculat; ++i) {
			System.out.print(primulNumar + " ");

			int urmatorulNumar = primulNumar + alDoileaNumar;
			primulNumar = alDoileaNumar;
			alDoileaNumar = urmatorulNumar;
		}
    
	}
    
	
	
	public static void rezolvareCuWhile() {
	
	
		int i = 1;
		int numereDeCalculat = 9; 
		int primulNumar = 0; 
		int alDoileaNumar = 1;
		
		System.out.print("Seria Fibonacci pentru " + numereDeCalculat + " numere: ");

		while (i <= numereDeCalculat) {
			System.out.print(primulNumar + " ");

			int urmatorulNumar = primulNumar + alDoileaNumar;
			primulNumar = alDoileaNumar;
			alDoileaNumar = urmatorulNumar;

			i++;
		}
		
    
	}
	
	
}
