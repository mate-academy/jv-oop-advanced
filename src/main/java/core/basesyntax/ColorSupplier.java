package core.basesyntax;

import core.basesyntax.enums.Colors;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int pick = random.nextInt(Colors.values().length);
        return Colors.values()[pick].name();
    }
}
