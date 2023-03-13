package curs7;

public class TestException {

	public static void main(String[] args) {

		AgeVerifier ageCheck = new AgeVerifier();
		
		try {
			ageCheck.checkAgeLimit(5);
		} catch (InvalidAgeException e) {
			//e.printStackTrace();
		}
		
		System.out.println("Cod dupa exceptie");
	}

}
