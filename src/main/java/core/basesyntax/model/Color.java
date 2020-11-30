package core.basesyntax.model;

import java.util.Random;

public enum Color {
    BLACK,
    WHITE,
    RED,
    GREEN,
    BLUE;

    public static Color randomColor() {
        Color[] values = Color.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
}
