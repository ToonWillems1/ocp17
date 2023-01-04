package advancedstreams;

import java.util.List;
import java.util.stream.Collectors;

public class TeeingCollector {
    
    public static void main(String[] args) {
        var list = List.of("x",  "y", "z");
        Seperations result = list.stream()
            .collect(Collectors.teeing(
                Collectors.joining(" "),
                Collectors.joining(", "),
                (s,c) -> new Seperations(s, c)));
        System.out.println(result);
    }
}

record Seperations(String spaceSeperated, String commaSeperated){}
