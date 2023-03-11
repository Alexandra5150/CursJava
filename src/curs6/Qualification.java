package curs6;

public class Qualification extends Teacher {


	public Qualification(String course, int experienceYears, String schedule) {
		super(course, experienceYears, schedule);
		
	}
	
	
	public void verify () {
		
		if(course == "Java" && experienceYears == 3 && schedule == "Afternoon") {
			
			System.out.println("You qualify to teach at this school!");
			
		} else {
			System.out.println("You do not qualify!");
		}
		
	}
	
	
}
