package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLORS = Color.values().length;
    private Random random = new Random();
    private int limitNumber = random.nextInt(NUMBER_OF_COLORS);

    public Color getRandomColor() {
        return Color.values()[limitNumber];
    }
}
