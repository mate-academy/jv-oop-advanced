package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    private final Random randomizer = new Random();

    public String getRandomColor() {
        int numberOfColors = Color.values().length;
        int randomColorCode = randomizer.nextInt(numberOfColors);
        return Color.values()[randomColorCode].name();
    }

}
