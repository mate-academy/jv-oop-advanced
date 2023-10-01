package core.basesyntax.model;

import java.util.Random;

public class ColorSupplier {
    private Random randomIndex = new Random();

    public String getRandomColor() {
        return Color.values()[randomIndex.nextInt(Color.values().length)].name();
    }
}
