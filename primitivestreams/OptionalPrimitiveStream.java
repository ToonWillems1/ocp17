package primitivestreams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class OptionalPrimitiveStream {
    public static void main(String[] args) {
        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println(sum);

        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        OptionalDouble min = doubles.min(); //runs infinitely, pi is irrational
        System.out.println(min);
    }
}
