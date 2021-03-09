package test;

import java.util.*;
import java.util.stream.IntStream;

public class LinkUtil {
	public static void main(String l[]) {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1,2,3,4,5);
		
		int sum = list.stream().mapToInt(a->a).sum();
		System.out.println("SUM::"+sum);
		
		OptionalDouble avg = list.stream().mapToInt(a->a).average();
		System.out.println("Double::"+avg);
	}

}
