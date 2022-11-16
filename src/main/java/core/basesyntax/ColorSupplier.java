package core.basesyntax;

import java.awt.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private final int colorRangeLimit = 20;

    public Color getRandomColor() {
        Color color = new Color(random.nextInt(colorRangeLimit));
        return color;
    }
}
