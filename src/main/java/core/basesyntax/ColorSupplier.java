package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] colors = {
            "red", "purple", "yellow", "black", "white", "blue"
    };

    final Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}