package core.basesyntax;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public String getRandomColor() {
        int choice = random.nextInt(Color.values().length);
        return Color.values()[choice].name().toLowerCase();
    }

    public String getDefaultColor() {
        return Color.WHITE.name().toLowerCase();
    }
}
