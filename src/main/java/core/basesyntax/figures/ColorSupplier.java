package core.basesyntax.figures;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int randomColorIndex = random.nextInt(Colors.values().length);
        return Colors.values()[randomColorIndex].name();
    }
}
