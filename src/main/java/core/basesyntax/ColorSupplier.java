package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Colors getRandomColor() {
        Colors [] colors = Colors.values();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
