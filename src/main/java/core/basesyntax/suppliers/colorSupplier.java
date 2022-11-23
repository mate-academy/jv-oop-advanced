package core.basesyntax.suppliers;

import core.basesyntax.models.Color;
import java.util.Random;

public class colorSupplier {
    public String getRandomColor() {
        int colorIndex = new Random().nextInt(Color.values().length - 1);
        return Color.values()[colorIndex].name();
    }
}
