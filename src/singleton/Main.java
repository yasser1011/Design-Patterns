package singleton;

public class Main {
    public static void main(String[] args) {
        Circle.setRadius(2);
        Circle c = Circle.getInstance();

        System.out.println(c.getRadius());

        Circle d = Circle.getInstance();
        Circle.setRadius(4);

        System.out.println(d.getRadius());
        System.out.println(c.getRadius());

    }
}
