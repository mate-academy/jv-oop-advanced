package core.basesyntax;

import java.util.Random;

public enum Colors {
    YELLOW,
    BLUE,
    GREEN,
    BLACK,
    WHITE,
    RED,
    ORANGE,
    CIAN;

    public static Colors randomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
