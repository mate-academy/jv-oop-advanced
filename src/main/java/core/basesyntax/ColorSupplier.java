package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    public static String getRandomColor() {
        int randNumber = new Random().nextInt(Color.values().length);
        return Color.values()[randNumber].name();
    }
}

