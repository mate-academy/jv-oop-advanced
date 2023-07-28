package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Color {
        Red,
        Blue,
        Green,
        Orange,
        White,
        Black,
        Purple
    }

    public String getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)].name();
    }
}
