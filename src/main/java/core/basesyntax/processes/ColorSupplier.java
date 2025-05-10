package core.basesyntax.processes;

import core.basesyntax.colors.Color;
import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public static Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
