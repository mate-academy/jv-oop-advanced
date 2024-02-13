package core.basesyntax.helpers;

import core.basesyntax.enums.Color;
import core.basesyntax.interfaces.RandomNumber;
import java.util.Random;

public class ColorSupplier implements RandomNumber {
    private static final Color[] COLORS = Color.values();

    public String getRandomColor(Random random) {
        int randomIndex = getRandomNumber(random, COLORS.length);
        return COLORS[randomIndex].name();
    }
}
