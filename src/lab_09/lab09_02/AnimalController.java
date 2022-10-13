package lab_09.lab09_02;

import lab_09.lab09_01.Employee;

import java.util.List;

public class AnimalController {
    public Animal maxSpeed(List<Animal> animalList){
        Animal maxAnimal= animalList.get(0);
        for (int i = 1; i < animalList.size(); i++) {
            if(animalList.get(i).getSpeed()>maxAnimal.getSpeed()){
                maxAnimal=animalList.get(i);
            }
        }
        return maxAnimal;
    }
}
