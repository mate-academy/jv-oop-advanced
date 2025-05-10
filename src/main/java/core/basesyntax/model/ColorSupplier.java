package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].getCode();
    }
}
