package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final int numberOfColors = Color.values().length;

    public String getRandomColor() {
        int randomIndex = random.nextInt(numberOfColors);
        return Color.values()[randomIndex].name();
    }
}
