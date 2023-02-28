package curs3;

public class VarstaMea {
	
	public void verificaVarstaMea (int numar) {
		
		
		if (numar < 18) {
			System.out.println("Esti minor");
			
		} else if (numar >= 18 && numar <= 65) {
			System.out.println("Esti adult");
			
		} else {
			System.out.println("Esti batran");
			
		}
				
			
		
	}
	
	
}
