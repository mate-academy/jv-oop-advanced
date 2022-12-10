package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final String[] color = {"White", "Black", "Red", "Yellow", "Orange", "Green",
            "Blue", "Purple",
            "Pink", "Brown", "Gray"};
    private static final Random rnd = new Random();

    public static String getRandomColor() {
        return color[rnd.nextInt(color.length)];
    }
}
