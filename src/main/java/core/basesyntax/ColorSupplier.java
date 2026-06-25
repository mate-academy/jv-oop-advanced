package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] colorsArray = Color.values();
        Random random = new Random();
        return (String.valueOf(colorsArray[random.nextInt(colorsArray.length)])).toLowerCase();
    }
}
