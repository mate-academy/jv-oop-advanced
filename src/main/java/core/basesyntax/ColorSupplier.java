package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    private enum Color {
        red,
        green,
        blue,
        yellow,
        orange,
        purple,
        black,
        white
    }

    public String getRandomColor() {
        Color[] colors = Color.values();
        int index = RANDOM.nextInt(colors.length);

        return colors[index].name();
    }
}