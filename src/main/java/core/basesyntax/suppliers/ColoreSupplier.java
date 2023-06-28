package core.basesyntax.suppliers;

import core.basesyntax.figure.type.Colors;
import java.util.Random;

public class ColoreSupplier {
    private static final Random random = new Random();
    
    public String getRandomColor() {
        int colorIndex = random.nextInt(Colors.values().length - 1);
        return Colors.values() [colorIndex].name();
    }
}
