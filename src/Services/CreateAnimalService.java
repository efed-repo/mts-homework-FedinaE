package Services;

import Models.TypeOfAnimal.Pets.Cat;

public class CreateAnimalService {
    public void createPet(String breed, String name, double cost, String character) {

        int counter = 1;
        while (counter <= 10) {
            new Cat(breed, name+counter, cost, character);
            System.out.println("Порода " + breed + ", имя " + name+counter + ", цена " + cost +", характер " + character);
            counter++;
        }
    }

}
