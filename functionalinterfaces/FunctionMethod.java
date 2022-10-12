package functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionMethod {
    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length; //method ref
        Function<String, Integer> f2 = k -> k.length(); //lambda

        System.out.println(f1.apply("Bock bock")); //9
        System.out.println(f2.apply("Bweek")); //5

        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (k, v) -> k.concat(v);

        System.out.println(b1.apply("Baby ", "Shark"));
        System.out.println(b2.apply("DOO ", "DOO DOO DOO DOO DOO"));
    }
}
