package strategy2;

public class Main {
    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println(sparky.tryToFly());
        System.out.println(tweety.tryToFly());

        sparky.setFlyingType(new ItFly());

        System.out.println(sparky.tryToFly());
    }
}
