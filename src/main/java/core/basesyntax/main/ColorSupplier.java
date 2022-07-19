package core.basesyntax.main;

import core.basesyntax.figures.Color;
import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public String getRandomColor() {
        int indexRandomColor = random.nextInt(Color.values().length);
        return Color.values()[indexRandomColor].name();
    }
}
