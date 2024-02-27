package Services;

import Models.TypeOfAnimal.Pets.Dog;
import Models.TypeOfAnimal.Predators.Wolf;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    //Переопределенный метод
    @Override
    public void createPet(String breed, String name, double cost, String character) {
        int counter = 1;
        do {
            new Dog(breed, name + counter, cost, character);
            System.out.println("Порода " + breed + ", имя " + name + counter + ", цена " + cost + ", характер " + character);
            counter++;
        }
        while (counter <= 10);

    }

    //Перегруженный метод
    public void createPet(String breed, String name, double cost, String character, int countOfAnimal) {

        for (int i = 1; i <= countOfAnimal; i++) {
            new Wolf(breed, name + i, cost, character);
            System.out.println("Порода " + breed + ", имя " + name + i + ", цена " + cost + ", характер " + character);
        }
    }
}
