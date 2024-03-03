package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 9;
    private Random random = new Random();
    private Color[] colors = Color.values();

    public Color getRandomColor() {
        int colorNumber = random.nextInt(COLOR_COUNT);
        return colors[colorNumber];
    }
}
