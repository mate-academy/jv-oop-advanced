package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }

    enum Color {
        RED,
        BLUE,
        BLACK,
        YELLOW,
        WHITE,
        GREEN,
        PURPLE,
    }
}
