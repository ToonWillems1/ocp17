package streams;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStreams{
   public static void main(String[] args) {
      Stream<String> stream = Stream.of("w", "o", "l", "f");
      Set<String> set = stream.collect(Collectors.toSet());
      System.out.println(set); //f, w, l, o usually

      Stream<String> stream2 = Stream.of("w", "o", "l", "f");
      TreeSet<String> set2 = 
         stream2.collect(Collectors.toCollection(TreeSet::new));
         System.out.println(set2); //f, l, o, w
   }
}