package curs7;

public class Account {

//	Clasa Account care contine:
//		3 variabile : 1 variabila private de tip int “accountNumber”
//		1 variabila publica de tip double “balance”
//		1 variabila publica de tip Customer pe nume ‘accountOwner’
//		Valoarea variabilelor se va seta la chemarea constructorului in clasa de executie
//		O metoda withdraw care primeste ca argument suma ce trebuie retrasa si arunca exceptia InsufficientFundsException
	
	
	public Account(int accountNumber, double balance, String accountOwner) {
		
	}
	
	private int accountNumber;
	public double balance;
	public String accountOwner;
	
	
	public void withdraw(int suma) throws InsufficientFundsException {
		
	}
	
}
