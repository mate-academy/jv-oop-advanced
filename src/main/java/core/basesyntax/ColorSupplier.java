package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomColor;

    public ColorSupplier(Random randomColor) {
        this.randomColor = randomColor;
    }

    public String getRandomColor() {
        return Color.values()[randomColor.nextInt(Color.values().length)].name();
    }
}
