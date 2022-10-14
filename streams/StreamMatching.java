package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamMatching {
    public static void main(String[] args) {
        var list = List.of("Monkey", "2", "Chimp");
        Stream<String> s = Stream.generate(()-> "Chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().allMatch(pred));  //false
        System.out.println(list.stream().anyMatch(pred));  //true
        System.out.println(list.stream().noneMatch(pred)); //false
        System.out.println(s.anyMatch(pred));              //true
    }
}
