package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public String getRandomColor() {
        return String.valueOf(Color.values()[random.nextInt(Color.values().length)]);
    }
}
