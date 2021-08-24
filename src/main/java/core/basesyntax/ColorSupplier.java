package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colorsArray = new String[]{"red", "blue", "black", "white", "yellow"};

    public String getRandomColor() {
        Random random = new Random();
        return colorsArray[random.nextInt(colorsArray.length)];
    }
}
