package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
   Random random = new Random();

    public Colors getRandomColor() {
        Colors[] colors = Colors.values();
        return colors[random.nextInt(colors.length)];
    }
}

