package Models.TypeOfAnimal.Pets;

import Models.TypeOfAnimal.Pet;

public class Dog extends Pet {
    public Dog(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    @Override
    public void playWithToy() {
        System.out.println("Люблю играть с мячиком");
    }
}
