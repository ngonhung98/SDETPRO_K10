package lab_10;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {

    public static void main(String[] args) {
        Animal tiger = new Animal.AnimalBuilder("tiger", 20).setIsWings(false).build();
        Animal duck = new Animal.AnimalBuilder("duck", 250).setIsWings(true).build();
        Animal dog = new Animal.AnimalBuilder("dog", 100).setIsWings(false).build();

        List<Animal> animals = Arrays.asList(tiger, duck, dog);
        AnimalController animalController = new AnimalController();
        Animal maxAnimal = animalController.getWinner(animals);
        if (maxAnimal != null)
            System.out.println(maxAnimal.getName() + ": " + maxAnimal.getSpeed());
        else
            System.out.println("Không con nào thắng");

    }
}
