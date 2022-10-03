package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public ColorSupplier(Random random) {
        this.random = random;
    }

    private static Random random;

    public String getRandomColor() {
        int indexEnumColor = random.nextInt(Color.values().length);
        return (Color.values()[indexEnumColor]).name();
    }
}
