package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int indexEnumColor = random.nextInt(Color.values().length);
        return (Color.values()[indexEnumColor]).name();
    }
}
