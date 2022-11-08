package core.basesyntax.Suppliers;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int colorIndex = new Random().nextInt(Colors.values().length);
        return Colors.values()[colorIndex].name();
    }
}
