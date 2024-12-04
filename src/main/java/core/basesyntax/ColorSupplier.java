package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rand = new Random();

    public Color getRandomColor() {
        return Color.values()[rand.nextInt(Color.values().length)];
    }
}
