package intro;
public class TextBlocks {
    static String textBlock = """
            "Java Study Guide"

                by Scott & Jeanne 
                """;
    
    static String pyramid = """
              *
             * *
            * * *
            """;
    public static void main(String[] args) {
        System.out.print(textBlock);
        System.out.print(pyramid);
    }
}
