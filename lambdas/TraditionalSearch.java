package lambdas;
import java.util.*;


public class TraditionalSearch {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, a -> a.canSwim()); //(Animal a) -> {return a.canHop();} does exactly the same thing.   
                                          //Animal::canSwim is the method reference version
    }

    private static void print(List<Animal> animals, CheckTrait checker){
        for(Animal animal : animals){
            if(checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();
    }
}
