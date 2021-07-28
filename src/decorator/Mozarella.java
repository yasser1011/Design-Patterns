package decorator;

public class Mozarella extends ToppingDecorator{
    public Mozarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("adding dough");
        System.out.println("adding mozarella");
    }
    public String getDescription(){
        return tempPizza.getDescription() + " mozarella";
    }
    public double getCost(){
        return tempPizza.getCost() + 1.00;
    }
}
