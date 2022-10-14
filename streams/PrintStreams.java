package streams;

import java.util.stream.Stream;

public class PrintStreams {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Ape", "Gorilla", "Monkeh");
        s.forEach(System.out::println);
    }
}
