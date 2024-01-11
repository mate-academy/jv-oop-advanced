package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(PossibleColors.values().length);
        return PossibleColors.values()[index].name().toLowerCase(Locale.ROOT);
    }
}
