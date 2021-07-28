package strategy2;

public class Animal {
    private String name;
    private double height;
    private int weight;
    private String favFood;
    private String sound;

    public Fly flyingType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingType(Fly newFlyType){
        flyingType = newFlyType;
    }
}
