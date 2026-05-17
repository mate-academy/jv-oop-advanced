package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomizer = new Random();
    private final Colors[] colors = Colors.values();

    public String getRandomColor() {
        return colors[randomizer.nextInt(colors.length)].name();
    }
}
