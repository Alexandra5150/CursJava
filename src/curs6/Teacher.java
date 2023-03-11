package curs6;

public class Teacher {
	
//	Scriem un program care verifica daca un profesor se califica sa predea la o scoala.
//	Daca se califica, atunci printeaza ”You qualify to teach at this school!”
//	Daca nu se califica, atunci printeaza “You do not qualify!”
//	Avem o clasa Teacher care are urmatoarele variabile si getteri si setteri pentu ele :
//	Course
//	ExperienceYears
//	Schedule
//	Avem o clasa Qualification care mosteneste clasa Teacher
//	In cadrul acestei clase avem un constructor care seteaza caracteristicle din Teacher (adica are constructor cu parametru unde cheama setteri din Teacher)
//	Avem o metoda care se numeste verify si care verifica urmatoarele:
//	Daca ExperienceYears sunt mai mari ca 3 si daca Course este egal cu “Java” si daca Schedule este egal cu “Afternoon”
//	Daca toate conditiile sunt indeplinite printeaza mesajul de qualification de mai sus.
//	Daca nu printeaza mesajul de necalificare de mai sus.
//	Avem a treia clasa care creaza un obiect de tip Qualification si executa metoda de verify.
	
	public String course;
	public int experienceYears;
	public String schedule;
	
	
	public Teacher(String course, int experienceYears, String schedule) {
		this.course = course;
		this.experienceYears = experienceYears;
		this.schedule = schedule;
	}
	
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getExperienceYears() {
		return experienceYears;
	}
	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	

}
