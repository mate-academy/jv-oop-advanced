package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    private static Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }

    enum Color {
        Red,
        Blue,
        Black,
        Yellow,
        White,
        Green,
        Purple,
    }
}
