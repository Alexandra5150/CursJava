package curs7;

public class Customer {

//	Vom scrie un program care simuleaza o mica parte dintr-un sistem bancar.
//	Programul va functiona astfel:
//	Clasa de test, va simula un withdraw de la un ATM.
//	Daca userul are suficienti bani in cont va printa noua balanta dupa retragere si mesajele:
//		“Please pick your money!” si ”Thank you for using our ATM”
//	Daca userul nu are suficienti bani va arunca o exceptie si va printa: 
//	“The amount you entered is greater than the available balance :” + balance si
//	”Thank you for using our ATM” si printam si stackTrace-ul exceptiei
		
//	1. Clasa Customer care contine trei variabile private ”name”, ‘address’,
//	“email”
//	2. Valoarea variabilelor se va seta la chemarea constructorului in clasa de
//	executie( customer = new Customer (“ion”, ”adresa”, etc))
	
	
	public Customer(String name, String address, String email) {
		this.name = name;
		this.address = address;
		this.email = email;
	}
	
	private String name;
	private String address;
	private String email;
	
	public String getName() {
		return name;
	}
	
}
