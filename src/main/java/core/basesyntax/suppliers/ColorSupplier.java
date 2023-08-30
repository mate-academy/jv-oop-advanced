package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index].name().toLowerCase();
    }

    public String getDefaultColor() {
        return Color.WHITE.name().toLowerCase();
    }
}
