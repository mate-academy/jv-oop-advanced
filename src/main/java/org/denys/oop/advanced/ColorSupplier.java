package org.denys.oop.advanced;

import java.util.List;
import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public static String getRandomColor() {
        List<String> colors = List.of("Red", "Blue", "Yellow", "White", "Purple");

        int randomIndex = RANDOM.nextInt(colors.size());
        return colors.get(randomIndex);
    }

}
