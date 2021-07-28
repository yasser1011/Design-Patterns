package singleton;

public class Circle {
    private static Circle circleInstance = new Circle();
    private static int radius;

    public static void setRadius(int newRadius){
        radius = newRadius;
    }

    public static int getRadius(){
        return radius;
    }

    public static Circle getInstance(){
        return circleInstance;
    }

    private Circle(){

    }
}
