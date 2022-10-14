package exceptions;

public class NullPointerEx {
    public void hop(String name, Integer jump){
        System.out.print(name.toLowerCase() + " " + jump.intValue());
    }
    public static void main(String[] args) {
        new NullPointerEx().hop(null, 1);
    }
}
