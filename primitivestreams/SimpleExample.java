package primitivestreams;

import java.util.stream.IntStream;

public class SimpleExample {
    public static void main(String[] args) {
        IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
        count.forEach(System.out::print);
        System.out.println();

        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::print);
        System.out.println();

        IntStream rangeclosed = IntStream.rangeClosed(1, 5);
        rangeclosed.forEach(System.out::print);
    }   
}
