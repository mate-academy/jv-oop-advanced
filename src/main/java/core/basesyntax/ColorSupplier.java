package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        int colourNumber = random.nextInt(4);
        return Color.values()[colourNumber];
    }
}
