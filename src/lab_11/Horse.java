package lab_11;

public class Horse extends Animal{
    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public int getName() {
        return 0;
    }
    public Horse(){
        this.setName("Horse");
    }
}
