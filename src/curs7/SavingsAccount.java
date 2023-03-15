package curs7;

public class SavingsAccount extends Account {

public SavingsAccount(int accountNumber, double balance, String accountOwner) {
		super(accountNumber, balance, accountOwner);
		
	}

//	Clasa SavingsAccount care mosteneste Account
//	Seteaza in constructor accountOwner, balance si accountNumber
//	Suprascrie metoda withdraw unde implementeaza:
//	- daca suma ce urmeaza a fi retrasa este mai mare decat balanta curenta,
//	arunca InsuficientFundsException
//	- altfel scade suma ce urmeaza a fi retrasa din balanta
	
	
	@Override
	public void withdraw(int suma) throws InsufficientFundsException {
		
		if (balance >= suma) {
			balance = balance - suma;
			System.out.println("Please pick your money!");
			System.out.println("Your new balance is: " + balance);
			System.out.println("Thank you for using our ATM");
			
		} else {
			System.out.println("The amount you entered is greater than the available balance: " + balance);
			System.out.println("Thank you for using our ATM");
			throw new InsufficientFundsException ("Insuficient funds for transaction");
		}
		
	}
	
}
