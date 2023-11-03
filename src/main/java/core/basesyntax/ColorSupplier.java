package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Colors[] color = Colors.values();
    private Random random = new Random();

    public Colors getRandomColor() {
        return color[random.nextInt(color.length)];
    }
}
