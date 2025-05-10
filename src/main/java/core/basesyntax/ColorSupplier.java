package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomizer = new Random();

    public String getRandomColor() {
        int randIndex = randomizer.nextInt(Color.values().length);
        return Color.values()[randIndex].name();
    }
}
