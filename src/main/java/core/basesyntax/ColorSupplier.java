package core.basesyntax;

import core.basesyntax.enums.Colors;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int i = random.nextInt(Colors.values().length);
        return Colors.values()[i].name().toLowerCase();
    }
}
