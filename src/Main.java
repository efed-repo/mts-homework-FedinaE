import Services.CreateAnimalService;
import Services.CreateAnimalServiceImpl;

public class Main {
    public static void main(String[] args) {

        CreateAnimalService createAnimalService = new CreateAnimalService();
        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();

        createAnimalService.createPet("Котик","Пушок", 6.2,"Добрый");
        createAnimalServiceImpl.createPet("Песик","Шарик", 10.0,"Дружелюбный");
        createAnimalServiceImpl.createPet("Волк","Френсис", 800.0,"Гордый",5);
    }
}