package Models.TypeOfAnimal.Predators;

import Models.TypeOfAnimal.Predator;

public class Wolf extends Predator {
    public Wolf(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    @Override
    public void eatMeat() {
        System.out.println("Я ем мясо зайца");
    }
}
