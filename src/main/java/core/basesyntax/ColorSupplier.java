package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public Color getRandomColor() {
        int indexColor = random.nextInt(Color.values().length);
        return Color.valueOf(Color.values()[indexColor].name());
    }
}
