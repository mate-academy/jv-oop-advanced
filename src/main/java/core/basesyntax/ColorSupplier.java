package main.java.core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    enum Colors {
        RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET
    }

    public static String getRandomColor() {
        Random random = new Random();
        int i = random.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[i]);
    }
}
