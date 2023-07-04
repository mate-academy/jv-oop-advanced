package core.basesyntax.suppliers;

import core.basesyntax.services.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random randomGenerator = new Random();

    public String getRandomColor() {
        int numberOfColors = Color.values().length;
        int index = randomGenerator.nextInt(numberOfColors);
        return Color.values()[index].name();
    }
}
