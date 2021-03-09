package test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ForEachIndex {
	public static void main(String l[]) {
		String[] names = {"Java", "Node", "JavaScript", "Rust", "Go"};

        List<String> collect = IntStream.range(0, names.length)
                .mapToObj(index -> index==3 ? index + ":" + names[index] : index + "," + names[index])
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
	}
}
