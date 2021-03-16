package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog{

    private String name;
    private int happiness;

    public Beagle(String name) {
        super(name);
        this.name = name;
        this.happiness=super.getHappiness();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHappiness() {
        return happiness;
    }

    public void feed(){
        this.happiness = this.happiness+2;
    }

    public void play(int hours){
        this.happiness = this.happiness+hours*2;
    }
}
