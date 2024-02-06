package core.basesyntax.suppliers;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Random random = new Random();
        int indexOfColor = random.nextInt(Color.values().length);
        return Color.values()[indexOfColor].name();
    }
}

