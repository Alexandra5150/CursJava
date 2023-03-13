package curs7;

public class FindIndexOfElement {
	
//	avem un array de tip in
//	vreau sa printam care ste indexul unui anumit element
//	ex: index pt elementul 6 este 3
//	rezolvare cu for
//	rezolvare cu for each
	

	static int[] number = {3, 4, 5, 6, 8, 9, 6};
	
	
	public static void main(String[] args) {
		
		//rezolvareCuFor();
		rezolvareCuForEach();

	}
	
	public static void rezolvareCuFor() {
		
		for (int i = 0; i<number.length; i++) {
			
			if(number[i] == 6) {
				System.out.println("index pt elementul 6 este " + i);
			}			
		}
				
	}
	
	
	public static void rezolvareCuForEach() {
		
		int i = 0;
		
		for(int element : number) {
			
			if(element == 6) {
				System.out.println("index pt elementul 6 este " + i);
			}
			i++;
		}
		
	}
	

}
