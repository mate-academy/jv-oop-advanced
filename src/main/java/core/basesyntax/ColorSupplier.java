package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Colors[] COLORS = Colors.values();
    private static final int COLORS_COUNT = COLORS.length;
    private Random random = new Random();

    private enum Colors {
        BLACK,
        RED,
        WHITE,
        YELLOW
    }

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS_COUNT)].name().toLowerCase();
    }
}
