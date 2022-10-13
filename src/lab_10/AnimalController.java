package lab_10;

import java.util.List;

public class AnimalController {

    public Animal getWinner(List<Animal> animalList){
        Animal maxAnimal = new Animal.AnimalBuilder("", -1).setIsWings(false).build();
        int max = -1;

        for (int i = 0; i < animalList.size(); i++) {
            if(animalList.get(i).getSpeed() > max && !animalList.get(i).isWings()){
                maxAnimal=animalList.get(i);
                max = maxAnimal.getSpeed();
            }
        }
        if(max == -1 ) {
            return null;
        }
        return maxAnimal;
    }
}
