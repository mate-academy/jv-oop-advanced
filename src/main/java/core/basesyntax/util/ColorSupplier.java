package core.basesyntax.util;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private static final int QUANTITY_COLOR = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        Color randomColor = Color.values()[random.nextInt(QUANTITY_COLOR)];
        return randomColor.toString();
    }
}
