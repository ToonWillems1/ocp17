package records;

//automatically private and final
public record Crane(int numberEggs, String name){
    public Crane{
        if(numberEggs<1) throw new IllegalArgumentException();
        name = name.toUpperCase();
    }
}

//old code without records
/* public final class Crane {
    private final int numberEggs;
    private final String name;

    public Crane(int numberEggs, String name){
        if (numberEggs >= 0) this.numberEggs = numberEggs;
        else throw new IllegalArgumentException();
        this.name = name;
    }
    public int getNumberEggs(){
        return numberEggs;
    }
    public String getName(){
        return name;
    }
}
*/