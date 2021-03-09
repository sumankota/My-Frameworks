package test;

import java.util.Arrays;
import java.util.List;

public class StringJoiner {
	public static void main(String l[])
	{
		List<String> list = Arrays.asList("node", "java", "c++", "react", "javascript");

        String result = list.stream().reduce((first, second) -> second).orElse("no last element");

        System.out.println(result);
	}

}
