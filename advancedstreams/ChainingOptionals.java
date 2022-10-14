package advancedstreams;

import java.util.Optional;

public class ChainingOptionals {
    
    //this is non runnable code, just a verbose method rewritten as a stream
    //mainloop below is written so IDE doesn't complain
    public static void main(String[] args) {
        threeDigit(Optional.empty());
    }
    
    private static void threeDigit(Optional<Integer> optional){
        optional.map(n -> "" + n)
            .filter(s -> s.length() == 3)
            .ifPresent(System.out::println);
    }

    //nested if's , better as stream (see above)
   /* 
    private static void threeDigit(Optional<Integer> optional){
        if(optional.isPresent()){
            var num = optional.get();
            var string = "" + num;
            if(string.length()==3) System.out.println(string);
        }
    }
     */
}
