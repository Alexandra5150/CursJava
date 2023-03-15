package curs6;

import java.util.Scanner;

public class Exercitiu5 {

	public static void main(String[] args) {


//		Scriem un program care intreaba utilizatorul un punctaj.
//		Daca utilizatorul introduce o valoare mai mare sau egala cu 90 ii atribuim FB
//		Daca utilizatorul introduce o valoare mai mare sau egala cu 80 ii atribuim B
//		Daca utilizatorul introduce o valoare mai mica decat 80 ii atribuim S
//		Daca a luat calificativ FB printam : “Ai primit : FoarteBine”
//		Daca a luat calificativ B printam : “Ai primit : Bine”
//		Daca a luat calificativ S printam : “Ai primit : Suficient”
		
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		int punctaj;
		punctaj = scan.nextInt();
		


        String result = punctaj >=90 ? "FB" : punctaj >= 80 ? "B" :"S";

        String greeting = (result.equals("FB"))? "Ai primit : FoarteBine" :(result.equals("B"))?"Ai primit : Bine":"Ai primit : Suficient";

        System.out.println(greeting); 
		
	}

}
