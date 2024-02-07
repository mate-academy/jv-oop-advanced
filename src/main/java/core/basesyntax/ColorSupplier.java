package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        int indexColor = random.nextInt(Color.values().length);
        return Color.values()[indexColor];
    }
}
