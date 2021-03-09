package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachTest {
	public static void main(String a[]) {
		/*HashMap*/
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		items.forEach((K,V) -> System.out.println("Key::"+K +" "+"Value::"+V));
		
		/*List*/
		List<String> itemsList = new ArrayList<String>();
		itemsList.add("Suman");
		itemsList.add("Mohana");
		itemsList.add("Deesha");
		itemsList.add("Janvi");
		
		itemsList.forEach(S-> System.out.println(S));
		
		itemsList.forEach(S->  {
			if(S.equalsIgnoreCase("DEESHA"))
				System.out.println(S+" Baby, lessthan 2 Years old"); 
			else
				System.out.println(S+" Age Morethan two years");			
		});
		
		itemsList.forEach(System.out::println);
			
		itemsList.stream()
		.filter(s->s.contains("D"))
		.forEach(System.out::println);
	}

}
