package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private int colorsNumber = Color.values().length;

    public Color getRandomColor() {
        return Color.values()[random.nextInt(colorsNumber)];
    }
}
