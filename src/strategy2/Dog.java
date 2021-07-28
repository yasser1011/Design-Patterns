package strategy2;

public class Dog extends Animal{
    public Dog(){
        super();
        setSound("Bark");
//        setFlyingType(new CantFly());
        flyingType = new CantFly();
    }
}
