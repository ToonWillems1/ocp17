package streams;

import java.util.List;


public class StreamPipeline {
    public static void main(String[] args) {
        List<String> list = List.of("Toby", "Anna", "Leroy", "Alex", "Swakke");
        list.stream()
            .filter(n -> n.length() == 4)
            .sorted()
            .limit(2)
            .forEach(System.out::println);
    }
}
