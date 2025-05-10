package core.basesyntax.supplier;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int colorIndex = random.nextInt(Color.values().length - 1);
        return Color.values()[colorIndex].name();
    }
}
