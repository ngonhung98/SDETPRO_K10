package lab_10;

public class Animal {
   private String name;
   private int speed;
   private boolean isWings;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWings() {
        return isWings;
    }

    public Animal(AnimalBuilder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.isWings = builder.isWings;
    }


    public static class AnimalBuilder {
        private String name;
        private int speed;
        private boolean isWings;

        public AnimalBuilder(String name, int speed){
            this.name=name;
            this.speed=speed;
        }

        public AnimalBuilder setIsWings(boolean isWings) {
            this.isWings = isWings;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }

    }

}
