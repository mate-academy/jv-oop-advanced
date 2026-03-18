package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random randomizer = new Random();

    public String getRandomColor() {
        Colors[] colors = Colors.values();

        return colors[randomizer.nextInt(colors.length)].name();
    }
}
