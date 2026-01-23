package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rand = new Random();

    public String getRandomColor() {
        Colors color = Colors.values()[rand.nextInt(Colors.values().length)];
        return color.name();
    }
}
