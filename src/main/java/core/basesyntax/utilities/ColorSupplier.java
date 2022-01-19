package core.basesyntax.utilities;

import core.basesyntax.colors.Color;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        return Color.values()
                [random.nextInt(Color.values().length - 1)].asLowerCase();
    }
}
