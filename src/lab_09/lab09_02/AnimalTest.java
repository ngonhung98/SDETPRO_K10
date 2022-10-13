package lab_09.lab09_02;

import lab_09.lab09_01.Employee;
import lab_09.lab09_01.EmployeeController;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();

        int randomSpeedTiger = new SecureRandom().nextInt(300);
        Animal tiger = new Tiger();
        tiger.setSpeed(randomSpeedTiger);
        animalList.add(tiger);
        int randomSpeedHorse = new SecureRandom().nextInt(300);
        Animal horse = new Horse();
        horse.setSpeed(randomSpeedHorse);
        animalList.add(horse);
        int randomSpeedDog = new SecureRandom().nextInt(300);
        Animal dog = new Dog();
        dog.setSpeed(randomSpeedDog);
        animalList.add(dog);


        Animal maxAnimal = new AnimalController().maxSpeed(animalList);
        System.out.println(animalList);
        System.out.println("Con vật có tốc độ lớn nhất là " + maxAnimal);
    }
}
