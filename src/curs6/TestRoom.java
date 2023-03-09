package curs6;

public class TestRoom {

	//encapsulation
	
	public static void main(String[] args) {

		//Room bucatarie = new Room();
		//bucatarie.lenght = 4;
		//bucatarie.width = 5;
		
		Room hol = new Room(4, 5);

		Baie baie = new Baie(3,2);
		System.out.println(baie.culoare);
		System.out.println(baie.culoareBaie());
		
		//System.out.println(bucatarie.calculateRectangleArea());
		System.out.println(hol.calculateRectangleArea());
	}

}
