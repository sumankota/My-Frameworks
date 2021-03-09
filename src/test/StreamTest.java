package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String l[]) {
		List<String> ss = new ArrayList<String>();
		ss.add("Suman");
		ss.add("Mohana");
		ss.add("Janvi");
		
		List<String> collect = ss.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		List<Integer> collect1 = num.stream().map(n-> n*2).collect(Collectors.toList());
		System.out.println(collect1);
	}

}
