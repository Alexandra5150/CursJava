package curs8;

import java.util.ArrayList;
import java.util.List;

public class Exercitiu3 {

//	Considerand cele doua ArrayList de mai jos:
//		Primul contine : Product1 ; Product2 ; Product3 ; Product4 ; Product5
//		Al doilea contine : Product1 ; Product2 ; Product6 ; Product4 ; Product8
//	Avem nevoie sa verificam daca produsele din primul arraylist se afla si in al doilea arrayList
//	Rezultatul verificarii ar trebui sa fie un output de tip yes/no
//	Ex din consola: [Yes, Yes, No, Yes, No]
	
	
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();		
		list1.add("Product1");
		list1.add("Product2");
		list1.add("Product3");
		list1.add("Product4");
		list1.add("Product5");
		
		List<String> list2 = new ArrayList<>();
		list2.add("Product1");
		list2.add("Product2");
		list2.add("Product6");
		list2.add("Product4");
		list2.add("Product8");
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list1.equals(list2));
		

        ArrayList<String> list3= new ArrayList<String>();
        
        for (String temp : list1)
            list3.add(list2.contains(temp) ? "Yes" : "No");
        System.out.println(list3);

	}

}
