package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        var colorIndex = random.nextInt(Colors.values().length);
        return Colors.values()[colorIndex].name().toLowerCase();
    }
}
