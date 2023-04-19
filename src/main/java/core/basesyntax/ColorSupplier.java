package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index;
    private Random random = new Random();

    public Color getRandomColor() {
        index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
