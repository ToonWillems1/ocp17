package functionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateMethod {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty; //method ref
        Predicate<String> p2 = s -> s.isEmpty(); //lambda

        System.out.println(p1.test("")); //true
        System.out.println(p2.test("")); //true

        BiPredicate<String, String> b1 = String::startsWith; //method ref
        BiPredicate<String, String> b2 = (k, v) -> k.startsWith(v); //lambda

        System.out.println(b1.test("Chicken", "Chick")); //true
        System.out.println(b2.test("Chicken", "chick")); //false, case sensitive
    }
}
