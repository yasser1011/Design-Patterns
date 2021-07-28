package factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.createAnimal("fox");

        animal.eat();
    }
}
