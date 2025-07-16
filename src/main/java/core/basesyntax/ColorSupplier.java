package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Color {
        BLACK,
        BLUE,
        GREEN,
        RED,
        YELLOW,
        WHITE
    }

    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
