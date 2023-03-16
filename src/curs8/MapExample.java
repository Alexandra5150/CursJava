package curs8;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("PM", "ProductManager");
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		System.out.println(map);
		
		
		System.out.println(map.get("T"));
		System.out.println(map.get("Tester"));//nu merge pt ca trb sa fie key
		
		System.out.println(map.containsValue("Support"));
		System.out.println(map.containsKey("D"));
		
		
		
		

	}

}
