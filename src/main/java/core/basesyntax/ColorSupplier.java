package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {
            "red", "purple", "yellow", "black", "white", "blue"
    };

    static final Random random = new Random();

    public static String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }

}