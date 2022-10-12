package intro;
class Insect {
    protected int numberOfLegs = 4;
    String label = "buggy";
}

public class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;
    public void printData(){
        System.out.println(super.label);
        System.out.println(this.age);
        System.out.println(this.numberOfLegs); //super to refer to numberOfLegs from Insect, remove super or use 'this.' to get the numberOfLegs from this class
    }

    public static void main(String[] args) {
        new Beetle().printData();
    }
}
