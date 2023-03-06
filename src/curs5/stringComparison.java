package curs5;

public class stringComparison {

	public static void main(String[] args) {


		String s1 = "masina";
		String s2 = "masina";

		System.out.println(s1==s2);//va afisa true
		
		String s3 = new String("masina");
		System.out.println(s1==s3);//va afisa false
		
		System.out.println("--------------");
		
		System.out.println(s1.equals(s3));
		
	}

}
