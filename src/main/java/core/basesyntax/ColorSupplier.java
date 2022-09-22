package core.basesyntax;

import core.basesyntax.enums.Colors;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int i = random.nextInt(Colors.values().length);
        return Colors.values()[i].toString().toLowerCase();
    }
}
