package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(DifferentColors.values().length);
        DifferentColors color = DifferentColors.values()[index];
        return color.toString();
    }
}
