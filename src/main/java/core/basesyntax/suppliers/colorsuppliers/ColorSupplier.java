package core.basesyntax.suppliers.colorsuppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    protected final Color[] colors = Color.values();
    private final Random random = new Random();

    public String getRandomColor() {
        return colors[getRandomIndex()].name();
    }

    private int getRandomIndex() {
        return random.nextInt(colors.length);
    }
}
