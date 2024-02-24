package Services;

import Models.TypeOfAnimal.Pets.Dog;
import Models.TypeOfAnimal.Predators.Wolf;

public class CreateAnimalServiceImpl extends CreateAnimalService {

    //Переопределенный метод
    @Override
    public void createPet(String breed, String name, double cost, String character) {
        int counter = 1;
        do {
            new Dog(breed, name, cost, character);
            counter++;
            System.out.println("Порода " + breed + ", имя " + name + ", цена " + cost + ", характер " + character);
        }
        while (counter <= 10);

    }

    //Перегруженный метод
    public void createPet(String breed, String name, double cost, String character, int countOfAnimal) {

        for (int i = 1; i <= countOfAnimal; i++) {
            new Wolf(breed, name, cost, character);
            System.out.println("Порода " + breed + ", имя " + name + ", цена " + cost + ", характер " + character);
        }
    }
}
