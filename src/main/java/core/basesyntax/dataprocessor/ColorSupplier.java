package core.basesyntax.dataprocessor;

import core.basesyntax.figures.Figure.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
