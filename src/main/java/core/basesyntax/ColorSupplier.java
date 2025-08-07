package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random rand = new Random();

    public Color getColor() {
        int index = rand.nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color;
    }
}
