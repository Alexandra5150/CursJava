package curs6;

public class Baie extends Room {

	public Baie(int lenght, int width) {
		super(lenght, width);

	}

	String culoare = "verde";
	
//	public String culoareBaie() {
//		return culoare;
//	}
	
	public String culoareBaie() {
		return super.culoare;
	}
	
}
