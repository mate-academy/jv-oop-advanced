package core.basesyntax.suppliers;

import core.basesyntax.figure.type.Colors;
import java.util.Random;

public class ColoreSupplier {
    public String getRandomColor() {
        int colorIndex = new Random().nextInt(Colors.values().length - 1);
        return Colors.values() [colorIndex].name();
    }
}
