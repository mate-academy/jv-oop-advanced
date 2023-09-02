package core.basesyntax.suppliers;

import core.basesyntax.enums.Colors;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();


    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        return Colors.values()[index].name().toLowerCase();
    }
}
