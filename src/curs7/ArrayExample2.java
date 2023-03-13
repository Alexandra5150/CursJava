package curs7;

public class ArrayExample2 {

	public static void main(String[] args) throws InterruptedException {

//		String[] orase = new String[4];
//		orase[0]="Iasi";
		
		String[] orase = {"Iasi", "Bacau", "Cluj", "Pitesti"};
		
		Thread.sleep(3000);
		
		System.out.println(orase[4]);
		
		for(String element : orase) {
			System.out.println(element);
		}

		
		//System.out.println(orase[4]); -> returneaza eroare ArrayIndexOutOfBoundsException
		
		
	}

}
