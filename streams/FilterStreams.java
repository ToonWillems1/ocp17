package streams;

import java.util.stream.Stream;

public class FilterStreams {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "ape", "chimp", "mate");
        s.filter(x -> x.startsWith("m"))
            .forEach(System.out::println);
    }
}
