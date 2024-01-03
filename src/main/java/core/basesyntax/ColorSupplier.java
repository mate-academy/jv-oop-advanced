package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int colorsLength = Colors.values().length;
        return Colors.values()[random.nextInt(colorsLength)].toString();
    }
}


