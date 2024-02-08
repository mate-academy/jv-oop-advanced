package core.basesyntax;

import core.basesyntax.enumforfigure.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    protected Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
