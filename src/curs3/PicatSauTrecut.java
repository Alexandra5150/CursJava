package curs3;

public class PicatSauTrecut {
	
	public void verificaPicatSauTrecut (int numar) {
		
		if(numar >= 0 && numar <= 65) {
			System.out.println("Ai picat. Mai incearca.");
			
		} else if (numar >= 66) {
			System.out.println("Felicitari, ai trecut.");
			
		}
		
		
	}

}
