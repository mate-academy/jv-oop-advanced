package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomColor = new Random();

    public String getRandomColor() {
        Color[] values = Color.values();
        int randomIndex = randomColor.nextInt(values.length);
        return values[randomIndex].name();
    }
}
