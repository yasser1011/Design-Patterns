package flyweight;

import java.awt.*;
import java.util.HashMap;

public class TshirtFactory {
    public static HashMap<Color, Tshirt> tshirtMap = new HashMap<>();

    static Tshirt createTshirt(Color color, int size){
        Tshirt shirt = tshirtMap.get(color);

        if(shirt == null){
            Tshirt newShirt = new Tshirt(color);
            tshirtMap.put(color, newShirt);
            newShirt.setSize(size);
            return newShirt;
        }else {
            shirt.setSize(size);
            return shirt;
        }
    }
}
