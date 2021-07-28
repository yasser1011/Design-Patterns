package factory;

import java.util.Locale;

public class AnimalFactory {
    public Animal createAnimal(String animalType){
        if(animalType == null) return null;
        else if(animalType.toLowerCase(Locale.ROOT).equals("dog")) return new Dog();
        else if(animalType.toLowerCase(Locale.ROOT).equals("cat")) return new Cat();
        else if(animalType.toLowerCase(Locale.ROOT).equals("fox")) return new Fox();

        return null;
    }
}
