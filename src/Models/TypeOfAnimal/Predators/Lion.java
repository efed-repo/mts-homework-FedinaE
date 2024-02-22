package Models.TypeOfAnimal.Predators;

import Models.TypeOfAnimal.Predator;

public class Lion extends Predator {
    public Lion(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    @Override
    public void eatMeat(){
        System.out.println("Я ем мясо зебры");
    }
}
