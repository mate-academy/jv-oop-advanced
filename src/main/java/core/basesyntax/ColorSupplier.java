package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomValue = new Random();

    public String getRandomColor() {
        return Color.values()[randomValue
                .nextInt(Color.values().length)].name().toLowerCase();
    }
}
