package Models.TypeOfAnimal;

import Models.AbstractAnimal;

public class Predator extends AbstractAnimal {

    public Predator(String breed, String name, double cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }

    public void eatMeat(){
        System.out.println("Я ем мясо");
    }

    @Override
    public void getCharacter() {
        System.out.println("Опасный!");;
    }
}
