package Models.TypeOfAnimal.Pets;

import Models.TypeOfAnimal.Pet;

public class Cat extends Pet {
    public Cat(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    @Override
    public void playWithToy() {
        System.out.println("Люблю играть с мышкой");;
    }

    public void sharpenClaws(){
        System.out.println("Цап-царап");
    }

}
