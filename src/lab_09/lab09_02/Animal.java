package lab_09.lab09_02;

public class Animal {
    private String name;
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
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
