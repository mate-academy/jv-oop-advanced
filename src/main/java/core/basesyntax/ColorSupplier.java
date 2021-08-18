package main.java.core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        String[] colors = {"red", "orange", "yellow", "green", "blue", "violet"};
        int i = random.nextInt(colors.length);
        return colors[i];
    }
}
