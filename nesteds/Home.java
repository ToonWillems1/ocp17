package nesteds;

import java.util.Arrays;
import java.util.List;

public class Home {
    private List<String> greeting = Arrays.asList("Hierse de Swakke", "Tis Johan jom", "Swakkeeeuu");

    protected class Room {
        public int repeat = 3;
        public void enter(){
            for (int i = 0; i < repeat; i++) greet(greeting.get(i));
        }
        private static void greet(String message){
            System.out.println(message);
        }
    }
    public void enterRoom(){
        var room = new Room();
        room.enter();
    }
    public static void main(String[] args) {
        var home = new Home();
        Room room = home.new Room();
        room.enter();
    }
}
