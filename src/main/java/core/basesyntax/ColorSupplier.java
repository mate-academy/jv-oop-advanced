package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_NUMBER = 4;
    private Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(COLOR_NUMBER);
        return Color.values()[index];
    }
}
