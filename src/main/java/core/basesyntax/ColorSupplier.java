package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomValue = new Random();

    public Color getRandomColor() {
        int index = randomValue.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
