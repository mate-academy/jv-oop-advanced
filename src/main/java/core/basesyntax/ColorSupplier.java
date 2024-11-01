package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor(){
        Color[] values = Color.values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex].toString().toLowerCase();
    }

}
