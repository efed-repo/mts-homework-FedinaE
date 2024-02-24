package Services;

import Models.TypeOfAnimal.Pets.Cat;

public class CreateAnimalService {
    public void createPet(String breed, String name, double cost, String character) {

        int counter = 1;
        while (counter <= 10) {
            new Cat(breed, name, cost, character);
            counter ++;
            System.out.println("Порода " + breed + ", имя " + name + ", цена " + cost +", характер " + character);
        }
    }

}
