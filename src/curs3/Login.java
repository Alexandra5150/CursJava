package curs3;

import java.util.Scanner;

public class Login {

	public void verificaLogin() {
		
		//ne ajuta sa citim de la tastatura
		Scanner scan  = new Scanner(System.in);
		
		String username = "test";
		String password = "test123";
		
		System.out.println("Te rog sa introduci username :");
		//variabila user va stoca dupa executie ce am scris de la tastatura
		String user = scan.next();
		System.out.println("Te rog sa introduci parola!");
		String pass = scan.next();
		
		// && -- AND
		// || -- OR
		// pt String in Java, facem validarea cu equals, pt orice altceva, folosim ==
		
		if(user.equals(username) && pass.equals(password) ) {
			System.out.println("Login successful!");
			
		} else {
			System.out.println("Login failed!");
			
		}
		
	}
	
	
	
}
