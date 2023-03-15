package curs6;

import java.util.Scanner;

public class Exercitiu1 {

	public static void main(String[] args) {

//		Scriem un program care simuleaza un login.
//		Programul primeste input de la utilizator un user si o parola.
//		Are trei incercari de logare
//		Atata timp cat incearca de trei ori si credentialele sunt gresite programul va printa : “Maximum attempts reached. User blocked”
//		Pentru fiecare incercare gresita programul printeaza : “Login Error”
//		Daca credentialele sunt valide programmul printeaza : “Login Successful”
//		Note:
//		Userul are valoarea valida : “TestUser”
//		Parola are valoarea valida :1234

		
		Scanner scan = new Scanner(System.in);
		
		String username = "TestUser";
		String password = "1234";

	       
        int totalAttempts = 0;

        do {
             //am mutat intrebarea in loop
             System.out.println("Please enter the username:");
             String user = scan.next();

             System.out.println("Please enter the password:");
             String pass = scan.next();

            
             if (user.equals(username) && pass.equals(password)) {
            	 System.out.println("Login successful!");
            	 break;
          //daca este cu sucess, ies din bucla
          //daca nu, vreau sa ma intorc sus in loop sa mai intreb o data   

         } else if (totalAttempts <2){

             System.out.println("Login error!");
             totalAttempts++;

         } else {

             System.out.println("Maximum attempts reached. User blocked");
             break;
         }           

        } while (totalAttempts < 3);
        
	}
	
}
