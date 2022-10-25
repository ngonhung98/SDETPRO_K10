package lab_11;

public class Dog extends Animal{

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public int getName() {
        return 0;
    }
    public Dog(){
        this.setName("Dog");
    }
}
