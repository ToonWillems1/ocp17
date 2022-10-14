package advancedstreams;

import java.util.List;
import java.util.Spliterator;

public class UsingSpliterator {
    public static void main(String[] args) {
        var stream = List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-", "mouse-");
        Spliterator<String> originalBagOfFood = stream.spliterator();
        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
        emmasBag.forEachRemaining(System.out::print);
        System.out.println();

        Spliterator<String> jillsBag = originalBagOfFood.trySplit();
        jillsBag.tryAdvance(System.out::print);
        System.out.println();
        jillsBag.forEachRemaining(System.out::print);
        System.out.println();

        originalBagOfFood.forEachRemaining(System.out::print);

        /*
            Stream program using spliterator, prints 1 2 3

         * var originalBag = Stream.iterate(1, n -> ++n)
         *      .spliterator();
         * 
         * Spliterator<Integer> newBag = originalBag.trySplit();
         * 
         * newBag.tryAdvance(System.out::print);  //prints 1
         * newBag.tryAdvance(System.out::print);  //prints 2
         * newBag.tryAdvance(System.out::print);  //prints 3
         */

    }
}
