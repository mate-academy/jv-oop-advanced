package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public enum Color {
        Red,
        Black,
        White,
        Green,
        Yellow,
        Blue
    }

    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
