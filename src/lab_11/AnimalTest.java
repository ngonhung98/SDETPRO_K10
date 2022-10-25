package lab_11;

import lab_09.lab09_02.Animal;
import lab_09.lab09_02.AnimalController;
import lab_09.lab09_02.Dog;
import lab_09.lab09_02.Horse;
import lab_09.lab09_02.Tiger;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        //Tiger
        int randomSpeedTiger = new SecureRandom().nextInt(300);
        Animal tiger = new Tiger();
        tiger.setSpeed(randomSpeedTiger);
        animalList.add(tiger);
        //Horse
        int randomSpeedHorse = new SecureRandom().nextInt(300);
        Animal horse = new Horse();
        horse.setSpeed(randomSpeedHorse);
        animalList.add(horse);
        //Dog
        int randomSpeedDog = new SecureRandom().nextInt(300);
        Animal dog = new Dog();
        dog.setSpeed(randomSpeedDog);
        animalList.add(dog);
        Animal maxAnimal = new AnimalController().maxSpeed(animalList);
        System.out.println(animalList);
        System.out.println("Con vật có tốc độ lớn nhất là " + maxAnimal);
    }
}
