package lab_11;

public abstract class Animal {
    private String name;
    private  int speed;
    public abstract int getSpeed();
    public  abstract int getName();
    public void setSpeed(int speed) {

        this.speed = speed;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        String animalString = this.name + ": " + this.speed;
        return animalString;
    }
}
