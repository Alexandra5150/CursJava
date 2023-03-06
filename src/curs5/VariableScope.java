package curs5;

public class VariableScope {
	
	//instance area (variabila de instanta)
	String nume; //nu e nevoie sa fie initializata
	

	//static area
	static String prenume;
	
	public static void afiseazaAltText(){
		System.out.println("Metoda statica");
	}
	
	
	
	public static void main(String[] args) {


		VariableScope obiect = new VariableScope();
		System.out.println(obiect.nume);
		//System.out.println(nume);
		System.out.println(prenume);
		obiect.afiseazaText();
		//afiseazaText();

	}

	
	public void afiseazaText() { //variabile locale
		String text = "Text";//nu poate fi neinitializata
		System.out.println(text);//variabila locala
		System.out.println(nume);//variabila de instanta
	}
	
}
