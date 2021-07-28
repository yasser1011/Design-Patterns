package flyweight;

import java.awt.*;

public class Tshirt {
    Color color;
    int size;

    public Tshirt(Color color, int size){
        this.color = color;
        this.size = size;
    }
    public Tshirt(Color color){
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
