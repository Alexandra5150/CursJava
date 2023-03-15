package curs7;

import java.util.Scanner;

public class Exercitiu1 {

	public static void main(String[] args) {

//		Scriem un program care printeaza in consola numele unei luni a anului bazandu-se pe inputul utilizatorului.
//		Intrebam utilizatorul un numar si pe baza numarului va printa numele lunii. Ex : utilizatorul introduce 1 si printeaza Ianuarie
//		Folosim un array pentru numele lunilor
//		Daca utilizatorul introduce un numar invalid, intreaba din nou pana numarul introdus este valid
//		Pentru numar invalid informeaza utilizatorul printr-un mesaj ca numarul este invalid.
		
		
		Scanner scan = new Scanner(System.in);
		int numar;
		
		String[] luniAn = {"ianuarie", "februarie", "martie", "aprilie", "mai", "iunie", "iulie", "august", "septembrie", "octombrie", "noiembrie", "decembrie"};
		
		
		do {
			System.out.println("Introdu un numar:");
			numar = scan.nextInt();
			
        if (numar >= 1 && numar <= 12) {
            System.out.println("Luna este: " + luniAn[numar-1]);
            break;

        } else {
            System.out.println("Numarul introdus este invalid.");
        }
		
		} while (numar > 12); 
	}

}
