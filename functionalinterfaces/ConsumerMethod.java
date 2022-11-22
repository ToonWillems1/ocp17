package functionalinterfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMethod {
    public static void Consumers(String name1, String name2){
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept(name1);
        c2.accept(name2);
    }

    public static void BiConsumers(String name1, Integer age1, String name2, Integer age2){
        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept(name1, age1);
        b2.accept(name2, age2);
        System.out.println(map);
    }
    
    public static void main(String[] args) {
        Consumers("Annie", "George");
        BiConsumers("Chicken", 7, "Chick", 1);
    }
}
