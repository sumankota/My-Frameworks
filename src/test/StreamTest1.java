package test;

import java.util.stream.Stream;

public class StreamTest1 {
	public static void main(String k[]) {
		Stream.iterate(0, n -> n + 1)
        .limit(10)
        .forEach(x -> System.out.println(x));
	}

}
