package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name().toLowerCase();
    }
}
