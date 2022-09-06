package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomizer = new Random();

    public String getRandomColor() {
        int index = randomizer.nextInt(Color.values().length);
        return Color.values()[index].toString().toLowerCase();
    }
}
