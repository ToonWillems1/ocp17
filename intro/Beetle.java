package intro;
class Insect {
    protected int numberOfLegs = 4;
    String label = "buggy";
}

public class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;
    public void printData(){
        int numberOfLegs = 5;
        System.out.println(super.label);
        System.out.println(this.age);
        System.out.println(numberOfLegs); //super to refer to numberOfLegs from Insect 
                                          // this to get the numberOfLegs from Beetle class
                                          // nothing to get it form this method
    }

    public static void main(String[] args) {
        new Beetle().printData();
    }
}
