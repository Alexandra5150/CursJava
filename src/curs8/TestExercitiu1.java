package curs8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class TestExercitiu1 {


		public static void main(String[] args) throws IOException {

			Exercitiu1 propFile2 = new Exercitiu1();
			//propFile2.writePropertiesFile();
			//propFile2.readPropertiesFile("morcov");
			
			InputStream inputStream = new FileInputStream("legume.properties");
			Properties file = new Properties() ;
			file.load(inputStream);
			
			int count = 0;
            
			do {
			     System.out.println("Ce leguma vrei sa cumperi?");
			     Scanner scan = new Scanner (System.in);
			     String leguma = scan.next();

			                    
			     if (file.keySet().contains(leguma)) {
			                          
			           String x = propFile2.readPropertiesFile(leguma);
			           System.out.println("Leguma aleasa de tine are " + x + " calorii");
			           count++;
			                          
			     } else {
			                          
			           System.out.println("Nu vindem aceasta leguma");
			           System.out.println("Te rog alege alta leguma");			                          
			     }

			} while (count <1);

			
		}
		
}
