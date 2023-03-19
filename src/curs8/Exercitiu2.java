package curs8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercitiu2 {

//	Scriem un program care reprezinta un catalog.
//	Contine Numele si Notele unor elevi (un nume, o nota de fiecare)
//	Intrebam elevul cum il cheama si ce nota a luat.
//	Daca elevul nu se regaseste in catalogul existent il adaugam cu tot cu nota si printam “Nu aveai nota, ti-am trecut acum!”
//	Daca elevul se regaseste si nota este mai mica decat nota existenta in catalog, printam “Nu ai nevoie de alta nota”
//	Daca elevul se regasete si noua nota este mai mare decat nota din catalog, facem update catalogului cu noua nota.
//	La final indiferent de situatie printam catalogul.
	
	
	public static void main(String[] args) {

		Map<String, Integer> catalog = new HashMap<>();
		
		catalog.put("Ana", 10);
		catalog.put("Maria", 10);
		catalog.put("Oana", 9);
		
		System.out.println(catalog);
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Cum te cheama?");
		String nume = scan.next();
		
		System.out.println("Ce nota ai luat?");
		int nota = scan.nextInt();
		
		if(catalog.keySet().equals(nume) && catalog.values() <= nota) {
		
			System.out.println("Nu ai nevoie de alta nota");
		
		} else if (catalog.keySet().equals(nume) && catalog.values() > nota) {
			
			catalog.put(nume, nota);
			System.out.println("Am facut update catalogului cu noua nota");
		
		} else {
		
			catalog.put(nume, nota);
			System.out.println("Nu aveai nota, ti-am trecut acum!");
		}
		
		System.out.println(catalog);

	}

}
