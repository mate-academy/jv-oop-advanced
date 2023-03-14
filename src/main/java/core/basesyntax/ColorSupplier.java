package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private int colorsNumber = COLOR.values().length;

    public COLOR getRandomColor() {
        return COLOR.values()[random.nextInt(colorsNumber)];
    }
}
