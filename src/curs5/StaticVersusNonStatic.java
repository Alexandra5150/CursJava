package curs5;

public class StaticVersusNonStatic {
	
	String nume;
	static String departament = "QA";
	

	public static void main(String[] args) {


		StaticVersusNonStatic person = new StaticVersusNonStatic();
		person.nume = "Oana";
		person.departament = "DEV";
		System.out.println(person.nume + departament);

		System.out.println("------------");
		
		StaticVersusNonStatic person2 = new StaticVersusNonStatic();
		person2.nume = "Maria";
		person2.departament = "HR";
		System.out.println(person2.nume + departament);
		
		System.out.println("------------");
		
		//departament = "DEV";
		StaticVersusNonStatic person3 = new StaticVersusNonStatic();
		person3.nume = "Ion";
		person3.departament = "Support";
		System.out.println(person3.nume + departament);
		
		System.out.println(person.nume + departament);
		System.out.println(person2.nume + departament);
		System.out.println(person3.nume + departament);
		
	}

}
