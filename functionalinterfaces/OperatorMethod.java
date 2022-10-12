package functionalinterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorMethod {
    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = v -> v.toUpperCase();

        System.out.println(u1.apply("sjonge jonge toch"));
        System.out.println(u2.apply("dat is een hele vieze asbak"));

        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (v,k) -> v.concat(k);

        System.out.println(b1.apply("Pater ", "Noster"));
        System.out.println(b2.apply("Paterke ", "Karel"));
    }
}
