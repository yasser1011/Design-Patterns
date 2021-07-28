package decorator;

public class Main {
    public static void main(String[] args) {
        Pizza basicPizza = new Tomato(new Mozarella(new PlainPizza()));

        System.out.println(basicPizza.getDescription());
        System.out.println("total cost " + basicPizza.getCost());
    }
}
