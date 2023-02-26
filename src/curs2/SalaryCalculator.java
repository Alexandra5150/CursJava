package curs2;

public class SalaryCalculator {

	int hoursWorked = 40;
	
	public static void main(String[] args) {

		Tester tester1 = new Tester();
		tester1.setName("Oana");
		tester1.setRatePerHour(30);
		tester1.setAge(20);
		
		Tester tester2 = new Tester();
		tester2.setName("Maria");
		tester2.setRatePerHour(25);
		
		System.out.println(tester1.getName());
		System.out.println(tester2.getName());
		
		SalaryCalculator calc = new SalaryCalculator();
		
		System.out.println("Salariul lui " + tester1.getName() + " este " + calc.calculateSalary(tester1.getRatePerHour()));
		
		System.out.println(tester1.getName() + " are : " + tester1.getAge() + " ani!");
		
	}

	
	public int calculateSalary (int ratePerHour) {
		int salary = ratePerHour * hoursWorked;
		return salary;
	}
	
}
