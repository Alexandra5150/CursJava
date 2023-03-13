package curs7;

public class TestAnimal {

	public static void main(String[] args) {

//		Animal animal = new Animal();
//		animal.makeSound();
//		
//		Deer bambi = new Deer();
//		bambi.makeSound();
//		bambi.eatGrass();
//		
//		Lion simba = new Lion();
//		simba.makeSound();
//		simba.eatMeat();
		
	//	Lion simba = new Lion();
	//	Webdriver obj = new ChromeDriver();
		
		Animal leu = new Lion(); //se poate face asta doar daca Lion extends Anima
		leu.makeSound();
		((Lion) leu).eatMeat();
		feedAnimal(leu);
		
		leu = new Deer();
		leu.makeSound();
		feedAnimal(leu);		
		
	}

	
	public static void feedAnimal(Animal object) {
		if(object instanceof Lion) {
			System.out.println("You are getting steak!");
		}else if(object instanceof Deer){
			System.out.println("You are getting salad!");
		}
		
	}
	
}
