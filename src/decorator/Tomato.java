package decorator;

public class Tomato extends ToppingDecorator{
    public Tomato(Pizza newPizza) {
        super(newPizza);
        System.out.println("adding dough");
        System.out.println("adding tomato");
    }
    public String getDescription(){
        return tempPizza.getDescription() + " tomato";
    }
    public double getCost(){
        return tempPizza.getCost() + 1.50;
    }
}
