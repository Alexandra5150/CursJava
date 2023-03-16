package curs7;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) throws InsufficientFundsException {

//		Clasa de executie TestSavingsAccount care simuleaza ATM–ul.
//		Creaza un obiect de tip Customer
//		Creaza un obiect de tip SavingsAccount
//		Saluta userul “Hi ” + name
//		Intreba userul ” Please enter the amount to withdraw”
		
		Customer customer = new Customer("Ion", "Bucuresti", "email");

		SavingsAccount savingsAccount = new SavingsAccount(123456, 15000, customer);
		
		String name = savingsAccount.accountOwner.getName();
		
		System.out.println("Hi " + name);
		System.out.println("Please enter the amount to withdraw:");
		
		Scanner scan = new Scanner (System.in);
		int suma = scan.nextInt();
		
		try {
		savingsAccount.withdraw(suma);
		
		} catch (InsufficientFundsException exceptie) {
			System.out.println(exceptie.getMessage());
		}
		

	}

}
