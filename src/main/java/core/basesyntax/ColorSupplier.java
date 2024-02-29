package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random index = new Random();

    public Color getRandomColor() {
        return Color.values()[index.nextInt(Color.values().length)];
    }
}
