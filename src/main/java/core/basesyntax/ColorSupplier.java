package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomColor = new Random();

    public String getRandomColor() {
        Color color = Color.values()[randomColor.nextInt(Color.values().length)];
        return color.name();
    }
}
