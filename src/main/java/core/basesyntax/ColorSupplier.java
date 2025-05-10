package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomColor = new Random();

    public String getRandomColor() {
        int randomValue = randomColor.nextInt(Color.values().length);
        return Color.values()[randomValue].name().toLowerCase();
    }
}
