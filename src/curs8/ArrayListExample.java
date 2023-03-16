package curs8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		//String [] array = new String[4];
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("Ioana");
		list.add("Ion");
		list.add("Maria");
		
		System.out.println(list.get(2));
		
		System.out.println("----------");
		
		list.add(1, "George");
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		list.remove(0);
		list.remove("Ioana");
		
		System.out.println("----------");
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		String text = "Maria";
		System.out.println(list.contains(text));
		
		System.out.println("----------");
		
		list.set(0, "Oana");
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		System.out.println("-----BEFORE-----");
		
		list.add("Ioana");
		list.add("Marian");
		
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		System.out.println("-----AFTER-----");
		
		list.subList(2, 4).clear();
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		
		

	}

}
