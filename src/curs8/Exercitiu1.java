package curs8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Exercitiu1 {

//	Scriem un program care printeaza in consola cate calorii are o leguma pe care utilizatorul vrea sa o cumpere.
//	Avem o metoda care scrie intr-un properties file 5 legume si un numar de calorii asociat lor (exemplu morcov=58)
//	Avem o metoda care citeste si din properties file valoarea caloriilor.
//	Daca utilizatorul introduce o leguma care nu se afla in acest data structure returneaza “Nu vindem aceasta leguma”
//	In metoda main intrebam utilizatorul ce leguma vrea sa cumpere.
//	Daca leguma se afla in cele pe care le avem in data structure printam : “Leguma aleasa de tine are X calorii”. 
//	Daca nu se afla printam “Nu vindem aceasta leguma” si rugam utilizatorul sa aleaga alta leguma.
	

	public void writePropertiesFile() throws IOException {
		
		try {
			OutputStream outputStream2 = new FileOutputStream("legume.properties");	
			
			Properties file2 = new Properties();
			file2.setProperty("morcov", "58");
			file2.setProperty("rosie", "50");
			file2.setProperty("castravete", "40");
			file2.setProperty("ridiche", "35");
			file2.setProperty("cartof", "80");
			
			file2.store(outputStream2, "Am salvat properties file");
					
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}	
		
	}
	
	
	public String readPropertiesFile(String key) throws IOException {
		
		try {
			InputStream inputStream2 = new FileInputStream("legume.properties");
			
			Properties file2 = new Properties();
			file2.load(inputStream2);
			
			return file2.getProperty(key);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	
}
