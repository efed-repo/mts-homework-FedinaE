package Models.TypeOfAnimal;

import Models.AbstractAnimal;

public class Pet extends AbstractAnimal {
    public Pet(String breed, String name, double cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }


    public void playWithToy(){
        System.out.println("Люблю играть");
    }

    @Override
    public void getCharacter() {
        System.out.println("Дружелюбный");;
    }


}
