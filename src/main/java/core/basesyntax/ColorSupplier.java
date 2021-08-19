package main.java.core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    enum Colors {
        red, orange, yellow, green, blue, violet
    }

    public static String getRandomColor() {
        Random random = new Random();
        int i = random.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[i]);
    }
}
