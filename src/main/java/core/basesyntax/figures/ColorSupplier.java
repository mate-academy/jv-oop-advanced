package core.basesyntax.figures;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 6;
    private Random random = new Random();

    public String getRandomColor() {
        int randomColorIndex = random.nextInt(COLOR_COUNT);
        return Colors.values()[randomColorIndex].name();
    }
}
