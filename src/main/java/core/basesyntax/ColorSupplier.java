package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor(){
        Random r = new Random();
        int index = r.nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
