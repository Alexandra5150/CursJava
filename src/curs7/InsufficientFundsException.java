package curs7;

public class InsufficientFundsException extends Exception {

//	Clasa InsuficientFundsException care este o clasa de exceptie custom. 
//	Extinde Exception si seteaza in constructor mesajul “Insuficient funds for transaction”
	
	
	public InsufficientFundsException (String mesaj) {
		super(mesaj);
		mesaj = "Insuficient funds for transaction";
	}
	
}
