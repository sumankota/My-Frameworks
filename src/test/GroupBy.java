package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
	public static void main(String k[])
	{
		List<String> newList = new ArrayList<>();
		newList.add("Apple");
		newList.add("Apple");
		newList.add("Guvva");
		newList.add("Guvva");
		newList.add("Banana");
		newList.add("Banana");
		newList.add("Mango");
		newList.add("Grapes");
		newList.add("Grapes");
		newList.add("Grapes");
	   
		Map<Character, List<String>> map = newList.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
		
		System.out.println("My Map values are::"+map);
		
	}

}
