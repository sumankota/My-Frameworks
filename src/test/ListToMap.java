package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListToMap {
	
	public static void main(String k[]) {
		
		List<String> list = Arrays.asList("Java", "Node", "JavaScript", "Rust", "Go");

        HashMap<Integer, String> collect = list
                .stream()
                .collect(HashMap<Integer, String>::new,
                        (map, streamValue) -> map.put(map.size(), streamValue),
                        (map, map2) -> {
                        });

        collect.forEach((s, v) -> System.out.println(s + ":" + v));
	}

}
