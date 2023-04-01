package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(PossibleColors.values().length);
        return PossibleColors.values()[index].name();
    }
}
