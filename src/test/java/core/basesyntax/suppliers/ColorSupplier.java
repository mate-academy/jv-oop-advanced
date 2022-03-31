package core.basesyntax.suppliers;

import core.basesyntax.enam.ColorList;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        return ColorList.values()[random.nextInt(ColorList.values().length)].toString();
    }
}