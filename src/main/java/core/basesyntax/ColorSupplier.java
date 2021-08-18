package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    private enum Color {
        red,
        orange,
        yellow,
        green,
        blue,
        white
    }

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].toString();
    }
}
