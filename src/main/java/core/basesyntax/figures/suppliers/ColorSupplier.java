package core.basesyntax.figures.suppliers;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int count = random.nextInt(Color.values().length);
        return Color.values()[count].name();
    }
}
