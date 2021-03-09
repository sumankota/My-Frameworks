package test;

import java.util.ArrayList;
import java.util.List;

public class StreamCondition {
	public static void main(String l[]) {
		List<Integer> aa = new ArrayList<>();
		aa.add(1);
		aa.add(2);
		aa.add(3);
		aa.add(4);
		aa.add(5);
		aa.add(6);
		aa.add(7);
		aa.add(8);
		aa.add(9);
		aa.add(10);
		
		aa.stream().filter(s ->s%2 == 0).limit(3).map(s ->s*s).forEach(s -> System.out.println(s));
		
		//aa.stream().forEach(s -> System.out.println(s));
		
	}

}
