package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random random = new Random();

    public enum Color {
        RED,
        WHITE,
        BLACK,
        BLUE,
        YELLOW,
        GREEN
    }

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
