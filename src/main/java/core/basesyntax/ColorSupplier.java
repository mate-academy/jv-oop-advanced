package core.basesyntax;

import java.util.Random;
public class ColorSupplier {
    enum Color {
        RED, ORANGE, YELLOW, GREEN, LIGHT_BLUE, BLUE, VIOLET, WHITE
    }

    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}

