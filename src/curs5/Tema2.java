package curs5;


public class Tema2 {
	
//	Scriem un program care numara cate vocale contine textul "Eu invat Java”.
//	Va printa urmatorul mesaj: Vocale: nr de vocale din text
//	Rezolvarea o facem atat cu FOR cat si cu While

	public static void main(String[] args) {

		rezolvareCuFor();
		//rezolvareCuWhile();

	}

	public static void rezolvareCuFor() {
		
		String text = "Eu invat Java".toLowerCase();
		//text = text.toLowerCase();

		int numarVocale = 0;
		
		for(int i=0; i<text.length(); i++) {
			
			if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
				
				numarVocale++;
			}
			
		}
		

			System.out.println("Vocale: " + numarVocale);
			
		}

	
	public static void rezolvareCuWhile() {		
		
		String text = "Eu invat Java".toLowerCase();

		int numarVocale = 0;
		
		int i = 0;

		
		while (i<text.length()) {


			if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
				
				numarVocale++;
			}
			
			i++;
			
		}
		
		System.out.println("Vocale: " + numarVocale);
		
		
	}
	
}
