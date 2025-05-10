package core.basesyntax.suppliers;

import core.basesyntax.Colors;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return Colors.values()[new Random().nextInt(Colors.values().length)]
                .toString().toLowerCase();
    }
}
