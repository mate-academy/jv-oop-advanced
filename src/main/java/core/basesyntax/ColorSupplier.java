package core.basesyntax;

import core.basesyntax.lists.Colors;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[index]);
    }
}
