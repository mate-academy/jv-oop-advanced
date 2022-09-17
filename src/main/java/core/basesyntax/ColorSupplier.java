package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(RandomColor.values().length);
        return RandomColor.values()[index].name();
    }

    public enum RandomColor {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        PURPLE,
        PINK,
        GREY,
        BLACK,
        BROWN
    }
}
