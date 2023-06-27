package core.basesyntax.suppliers;

import core.basesyntax.services.Color;
import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        int numberOfColors = Color.values().length;
        int index = RANDOM.nextInt(numberOfColors);
        return Color.values()[index].name();
    }
}
