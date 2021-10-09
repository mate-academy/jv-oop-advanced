package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 5;
    private Random random = new Random();

    public enum Color {
        BLACK,
        WHITE,
        RED,
        GREEN,
        BLUE
    }

    public String getFigureColor() {
        int randomColor = random.nextInt(COLOR_COUNT);
        return Color.values()[randomColor].toString();
    }
}
