package curs8;

import java.io.IOException;
import java.util.Scanner;

public class TestExercitiu1 {


		public static void main(String[] args) throws IOException {

			System.out.println("Ce leguma vrei sa cumperi?");
			Scanner scan = new Scanner (System.in);
			String leguma = scan.next();


			Exercitiu1 propFile2 = new Exercitiu1();
			//propFile2.writePropertiesFile();
			//propFile2.readPropertiesFile("morcov");
			
			
			
			if (propFile2.keySet().contains(leguma)) {
				
				String x = propFile2.readPropertiesFile(leguma);
				System.out.println("Leguma aleasa de tine are " + x + " calorii");
				
			} else {
				
				System.out.println("Nu vindem aceasta leguma");
				System.out.println("Te rog alege alta leguma");
				
			}
			
		}
		

}
